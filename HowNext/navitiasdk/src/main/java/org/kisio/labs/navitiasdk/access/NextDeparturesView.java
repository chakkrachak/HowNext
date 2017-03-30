package org.kisio.labs.navitiasdk.access;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.kisio.labs.navitiasdk.models.StopSchedule;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.kisio.labs.navitiasdk.models.StopSchedulesResponse;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class NextDeparturesView {
    private ListView mListView;
    private ArrayAdapter adapter;
    private ArrayList<String> listItems;
    private AppCompatActivity linkedActivity;

    DateFormat navitiaDateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss");
    public NextDeparturesView(AppCompatActivity linkedActivity, int stopSchedulesListView) {
        this.linkedActivity = linkedActivity;
        mListView = (ListView) this.linkedActivity.findViewById(stopSchedulesListView);
        listItems = new ArrayList<String>();

        new GetDataTask(this.listItems).execute();

        adapter = new ArrayAdapter(this.linkedActivity, android.R.layout.simple_list_item_1, listItems);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                AlertDialog alertDialog = new AlertDialog.Builder(linkedActivity).create();
                alertDialog.setTitle("Open route");
                alertDialog.setMessage(listItems.get(i));
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                alertDialog.show();
            }
        });
    }

    class GetDataTask extends AsyncTask<Void, Void, Void> {
        private ArrayList<String> listItems;

        public GetDataTask(ArrayList<String> listItems) {
            this.listItems = listItems;
        }

        void fetchData(String url, ArrayList<String> listItems) throws IOException {
            String token = "9e304161-bb97-4210-b13d-c71eaf58961c";
            String coverage = "fr-idf";

            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder()
                    .url(url)
                    .addHeader("Authorization", token)
                    .build();

            Response response = client.newCall(request).execute();
            String jsonResponse = response.body().string();

            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
            StopSchedulesResponse stopSchedulesResponse = gson.fromJson(jsonResponse, StopSchedulesResponse.class);
            Date now = new Date();
            for (StopSchedule stopSchedule : stopSchedulesResponse.getStopSchedules()) {
                Date currentDate = null;
                try {
                    currentDate = navitiaDateFormat.parse(stopSchedule.getDateTimes().get(0).getDateTime());
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                listItems.add(stopSchedule.getStopPoint().getLabel() + " [" + stopSchedule.getDisplayInformations().getLabel() + "] " + " => " + (currentDate.getTime() - now.getTime())/(1000*60) + " min");
            }
        }

        @Override
        protected Void doInBackground(Void... voids) {
            try {
                fetchData("https://api.navitia.io/v1/coverage/fr-idf/coords/2.377310%3B48.847002/stop_schedules?distance=500&count=20&", this.listItems);
            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            adapter.notifyDataSetChanged();
        }
    }
}
