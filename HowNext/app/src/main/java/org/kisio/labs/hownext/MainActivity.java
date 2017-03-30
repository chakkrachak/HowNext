package org.kisio.labs.hownext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import hownext.labs.kisio.org.hownext.R;
import org.kisio.labs.navitiasdk.access.NextDeparturesActivity;
import org.kisio.labs.navitiasdk.access.NextDeparturesView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        NextDeparturesActivity nextDeparturesActivity = new NextDeparturesActivity();

        nextDeparturesActivity.startInto(this);
    }
}
