package com.example.ghostbusers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class JourneyPlannerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journey_planner);
    }

    public void onJourneyDetailsClick(View view) {
        Intent reportAProblem = new Intent( this,JourneyDetails.class);
        startActivity(reportAProblem);
    }
}
