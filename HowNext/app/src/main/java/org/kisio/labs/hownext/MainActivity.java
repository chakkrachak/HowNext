package org.kisio.labs.hownext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import hownext.labs.kisio.org.hownext.R;

public class MainActivity extends AppCompatActivity {
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.stopSchedulesListView);

        int listSize=10;
        String[] listItems = new String[listSize];
        for (int i = 0; i < listSize; i++) {
            listItems[i] = Integer.toString(i);
        }

        String url = "https://api.navitia.io/v1/coverage/fr-idf/coords/2.377310%3B48.847002/stop_schedules?distance=500&count=5&";

        listItems[0] = url;


        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listItems);
        mListView.setAdapter(adapter);
    }
}
