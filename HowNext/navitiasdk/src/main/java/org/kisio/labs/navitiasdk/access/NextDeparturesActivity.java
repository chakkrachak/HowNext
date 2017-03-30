package org.kisio.labs.navitiasdk.access;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import hownext.labs.kisio.org.navitiasdk.R;

public class NextDeparturesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_departures);

        NextDeparturesView nextDeparturesView = new NextDeparturesView(this, R.id.stopSchedulesListView);
    }

    public void startInto(AppCompatActivity activity) {
        Intent intent = new Intent(activity, this.getClass());
        activity.startActivity(intent);
    }
}
