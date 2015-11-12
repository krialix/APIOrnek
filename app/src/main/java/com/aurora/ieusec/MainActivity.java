package com.aurora.ieusec;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.aurora.ieusec.model.ForecastIoResponse;

import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    private TextView mSummaryContentTextView;
    private TextView mTemperatureContentTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupViews();

        getWeather();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private void getWeather() {
        ApiManager.getApi("https://api.forecast.io/forecast/")
                .getWeather("38.423734", "27.142826", "minutely,hourly,alerts,flags", "auto")
                .enqueue(new Callback<ForecastIoResponse>() {
                    @Override
                    public void onResponse(Response<ForecastIoResponse> response, Retrofit retrofit) {
                        mSummaryContentTextView.setText(response.body().getCurrently().getSummary());
                        mTemperatureContentTextView.setText(String.valueOf(response.body().getCurrently().getTemperature()));
                    }

                    @Override
                    public void onFailure(Throwable t) {
                        t.fillInStackTrace();
                    }
                });
    }

    private void setupViews() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mSummaryContentTextView = (TextView) findViewById(R.id.summary_content);
        mTemperatureContentTextView = (TextView) findViewById(R.id.temperature_content);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
