package org.kisio.labs.navitiasdk.access;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import org.kisio.labs.navitiasdk.models.stopschedules.StopSchedule;
import org.kisio.labs.navitiasdk.models.stopschedules.StopSchedulesResponse;
import org.kisio.labs.navitiasdk.utils.DataFetcher;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NextDeparturesView {
    private ListView stopSchedulesListView;
    private ArrayAdapter adapter;
    private ArrayList<String> listItems;
    private AppCompatActivity linkedActivity;
    private List<StopSchedule> currentStopSchedules;

    DateFormat navitiaDateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss");

    public NextDeparturesView(AppCompatActivity linkedActivity, int stopSchedulesListViewId) {
        this.linkedActivity = linkedActivity;
        this.stopSchedulesListView = (ListView) this.linkedActivity.findViewById(stopSchedulesListViewId);
        this.listItems = new ArrayList<String>();
        this.currentStopSchedules = new ArrayList<StopSchedule>();

        new GetStopSchedulesAsyncTask(this.listItems).execute();

        this.adapter = new ArrayAdapter(this.linkedActivity, android.R.layout.simple_list_item_1, listItems);
        this.stopSchedulesListView.setAdapter(adapter);

        stopSchedulesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(linkedActivity, RoadBookActivity.class);
                intent.putExtra("from", "2.3880234;48.8378968");
                String to = currentStopSchedules.get(i).getStopPoint().getCoord().getLon() + ";" + currentStopSchedules.get(i).getStopPoint().getCoord().getLat();
                intent.putExtra("to", to);
                linkedActivity.startActivity(intent);
            }
        });
    }

    class GetStopSchedulesAsyncTask extends AsyncTask<Void, Void, Void> {
        private ArrayList<String> listItems;

        public GetStopSchedulesAsyncTask(ArrayList<String> listItems) {
            this.listItems = listItems;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            try {
                DataFetcher<StopSchedulesResponse> dataFetcher = new DataFetcher<>(StopSchedulesResponse.class, "9e304161-bb97-4210-b13d-c71eaf58961c");
                StopSchedulesResponse stopSchedulesResponse = dataFetcher.fetch("https://api.navitia.io/v1/coverage/fr-idf/coords/2.377310%3B48.847002/stop_schedules?distance=500&count=20&");
                Date now = new Date();
                currentStopSchedules = stopSchedulesResponse.getStopSchedules();
                for (StopSchedule stopSchedule : currentStopSchedules) {
                    Date currentDate = null;
                    try {
                        currentDate = navitiaDateFormat.parse(stopSchedule.getDateTimes().get(0).getDateTime());
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    this.listItems.add(stopSchedule.getStopPoint().getLabel() + " [" + stopSchedule.getDisplayInformations().getLabel() + "] " + " => " + (currentDate.getTime() - now.getTime())/(1000*60) + " min");
                }
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
