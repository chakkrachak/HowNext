package org.kisio.labs.navitiasdk.access;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import hownext.labs.kisio.org.navitiasdk.R;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.kisio.labs.navitiasdk.models.StopSchedule;
import org.kisio.labs.navitiasdk.models.StopSchedulesResponse;
import org.kisio.labs.navitiasdk.utils.DataFetcher;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public class RoadBookActivity extends AppCompatActivity {
    private ListView roadBookListView;
    private ArrayList<String> roadBookItems;
    private ArrayAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_road_book);
        roadBookListView = (ListView) this.findViewById(R.id.roadBookListView);

        roadBookItems = new ArrayList<String>();

        for (int i=0; i < 10; i++) {
            roadBookItems.add(String.valueOf(i));
        }

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, roadBookItems);
        roadBookListView.setAdapter(adapter);
    }

    class GetJourneyAsyncTask extends AsyncTask<Void, Void, Void> {
        private ArrayList<String> listItems;

        public GetJourneyAsyncTask(ArrayList<String> listItems) {
            this.listItems = listItems;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            try {
                DataFetcher<StopSchedulesResponse> dataFetcher = new DataFetcher<>(StopSchedulesResponse.class, "9e304161-bb97-4210-b13d-c71eaf58961c");
                StopSchedulesResponse stopSchedulesResponse = dataFetcher.fetch("https://api.navitia.io/v1/coverage/fr-idf/journeys?to=2.373686;48.845796&from=2.3880234;48.8378968");
                Date now = new Date();
                for (StopSchedule stopSchedule : stopSchedulesResponse.getStopSchedules()) {
                    this.listItems.add("");
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
