package vn.edu.usth.usthweather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;


public class WeatherActivity extends AppCompatActivity {

    @Override
    public void onPause() {

        super.onPause();
        Log.i("cmt:","onPause method");
    }

    @Override
    public void onStart() {

        super.onStart();
        Log.i("cmt:","onStart method");
    }

    @Override
    public void onResume() {

        super.onResume();
        Log.i("cmt:","onResume method");
    }

    @Override
    public void onStop() {

        super.onStop();
        Log.i("cmt:","onStop method");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("cmt:","onDestroy method");
    }

    //initial creation of the fragment
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i("cmt:","onCreate method");

        // Create a new Fragment to be placed in the activity layout
       ForecastFragment firstFragment= new ForecastFragment();

       // Add the fragment to the 'container' FrameLayout
        getSupportFragmentManager().beginTransaction().add(
                R.id.container, firstFragment).commit();

    }
}