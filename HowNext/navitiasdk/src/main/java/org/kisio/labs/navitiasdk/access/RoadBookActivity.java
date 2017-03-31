package org.kisio.labs.navitiasdk.access;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.google.common.base.Strings;
import hownext.labs.kisio.org.navitiasdk.R;
import org.kisio.labs.navitiasdk.models.journeys.Journey;
import org.kisio.labs.navitiasdk.models.journeys.JourneysResponse;
import org.kisio.labs.navitiasdk.models.journeys.Path;
import org.kisio.labs.navitiasdk.models.journeys.Section;
import org.kisio.labs.navitiasdk.utils.DataFetcher;

import java.io.IOException;
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

        new GetJourneyAsyncTask(getIntent().getStringExtra("from"), getIntent().getStringExtra("to") , this.roadBookItems).execute();

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, roadBookItems);
        roadBookListView.setAdapter(adapter);
    }

    class GetJourneyAsyncTask extends AsyncTask<Void, Void, Void> {
        private String from;
        private String to;
        private ArrayList<String> listItems;

        public GetJourneyAsyncTask(String from, String to, ArrayList<String> listItems) {
            this.from = from;
            this.to = to;
            this.listItems = listItems;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            try {
                DataFetcher<JourneysResponse> dataFetcher = new DataFetcher<>(JourneysResponse.class, "9e304161-bb97-4210-b13d-c71eaf58961c");
                JourneysResponse journeysResponse = dataFetcher.fetch("https://api.navitia.io/v1/coverage/fr-idf/journeys?to="+this.to+"&from="+this.from);
                Date now = new Date();
                for (Journey journey : journeysResponse.getJourneys()) {
                    for (Section section : journey.getSections()) {
                        for (Path path : section.getPath()) {
                            String pathName = path.getName();
                            if (!Strings.isNullOrEmpty(pathName)) {
                                this.listItems.add(pathName);
                            }
                        }
                    }
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
