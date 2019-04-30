package com.example.joju.goodies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.net.Uri;

public class menu extends AppCompatActivity {

    private static final String LOG_TAG =
            first.class.getSimpleName();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void launchCollectActivity(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, collect.class);
        startActivity(intent);
    }
    public void launchDonateActivity(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, donate.class);
        startActivity(intent);
    }
    public void launchEnterActivity(View view){
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, enter_.class);
        startActivity(intent);
    }
    public void launchRemoveActivity(View view){
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, enter_.class);
        startActivity(intent);
    }
    public void goToMap(View view){

        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://fcs.net.in"));
        startActivity(intent);
    }

}
