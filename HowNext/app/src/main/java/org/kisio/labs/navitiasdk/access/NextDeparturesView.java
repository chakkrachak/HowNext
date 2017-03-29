package org.kisio.labs.navitiasdk.access;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import hownext.labs.kisio.org.hownext.R;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.kisio.labs.navitiasdk.models.StopSchedule;
import org.kisio.labs.navitiasdk.models.StopSchedulesResponse;

import java.io.IOException;
import java.util.ArrayList;

public class NextDeparturesView {
    private ListView mListView;
    private ArrayAdapter adapter;
    private ArrayList<String> listItems;

    public NextDeparturesView(AppCompatActivity appCompatActivity, int stopSchedulesListView) {
        mListView = (ListView) appCompatActivity.findViewById(stopSchedulesListView);
        listItems = new ArrayList<String>();

        new GetDataTask(this.listItems).execute();

        adapter = new ArrayAdapter(appCompatActivity, android.R.layout.simple_list_item_1, listItems);
        mListView.setAdapter(adapter);
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
            for (StopSchedule stopSchedule : stopSchedulesResponse.getStopSchedules()) {
                listItems.add(stopSchedule.getStopPoint().getLabel());
            }
        }

        @Override
        protected Void doInBackground(Void... voids) {
            try {
                fetchData("https://api.navitia.io/v1/coverage/fr-idf/coords/2.377310%3B48.847002/stop_schedules?distance=500&count=5&", this.listItems);
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
