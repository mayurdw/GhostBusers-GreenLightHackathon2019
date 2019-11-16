package com.example.ghostbusers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class JourneyDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journey_details);
    }

    public void onReportAProblemClick(View view) {
        Intent reportAProblem = new Intent(this, HadAProblemActivity.class);
        startActivity(reportAProblem);
    }
}
