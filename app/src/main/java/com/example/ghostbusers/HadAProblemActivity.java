package com.example.ghostbusers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class HadAProblemActivity extends AppCompatActivity {
    private final String TAG = "PROBLEM_ACTIVITY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_had_aproblem);
    }

    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT ).show();
    }

    public void onSubmitButton(View view) {
        showToast("Problem Report Submitted");
        Intent journeyPlanner = new Intent(this, JourneyPlannerActivity.class);
        startActivity(journeyPlanner);
    }
}
