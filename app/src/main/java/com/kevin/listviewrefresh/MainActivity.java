package com.kevin.listviewrefresh;

import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kevin.listviewrefresh.utils.KevinRefreshLayout;
import com.kevin.listviewrefresh.utils.listener.OnRefreshListener;

public class MainActivity extends AppCompatActivity implements OnRefreshListener {

    private KevinRefreshLayout kevinRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kevinRefreshLayout = (KevinRefreshLayout) findViewById(R.id.haokan_refresh);
        kevinRefreshLayout.setOnRefreshListener(this);
        kevinRefreshLayout.setRefreshing(true);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                kevinRefreshLayout.setRefreshing(false);
            }
        }, 3000);

        kevinRefreshLayout.setWaveBackgroundColor(Color.parseColor("#3F51B5"));
    }


    @Override
    public void onRefresh() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                kevinRefreshLayout.setRefreshing(false);
            }
        }, 3000);
    }

}
