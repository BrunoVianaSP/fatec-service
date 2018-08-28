package dev.fatecsp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class LoadingActivity extends AppCompatActivity {

    private static final int OPEN_LOGIN_ACTIVITY_DELAY = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(LoadingActivity.this, LoginActivity.class);
                startActivity(i);
            }
        }, OPEN_LOGIN_ACTIVITY_DELAY);

    }

}
