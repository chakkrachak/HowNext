package org.kisio.labs.hownext;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.google.common.base.Strings;
import com.google.gson.GsonBuilder;
import hownext.labs.kisio.org.hownext.R;
import okhttp3.*;
import org.kisio.labs.navitiasdk.access.NextDeparturesView;
import org.kisio.labs.navitiasdk.models.StopSchedule;
import org.kisio.labs.navitiasdk.models.StopSchedulesResponse;

import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NextDeparturesView nextDeparturesView = new NextDeparturesView(this, R.id.stopSchedulesListView);
    }
}
