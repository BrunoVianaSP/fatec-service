package dev.fatecsp.schedule;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import dev.fatecsp.R;
import dev.fatecsp.utils.MyFragmentManager;


public class ScheduleActivity extends AppCompatActivity implements NewScheduleFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.btnAddNewPerformance);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_SHORT)
//                        .setAction("Adicionar Nova Aula", null)
//                        .setAction("Adicionar Nova Aula", null).show();
                createNewSchedule();
            }
        });

    }

    private void createNewSchedule() {
        MyFragmentManager.replace(this, NewScheduleFragment.newInstance("",""), R.id.content_schedule);
    }

    @Override
    public void search() {

    }
}
