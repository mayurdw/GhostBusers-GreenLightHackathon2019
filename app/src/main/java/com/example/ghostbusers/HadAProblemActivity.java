package com.example.ghostbusers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class HadAProblemActivity extends AppCompatActivity {
    private final String TAG="PROBLEM_ACTIVITY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_had_aproblem);
    }

    public void problemClicked(View view) {
        int viewId = view.getId();
        String message;
        switch( viewId){
            case R.id.early_or_late: message = getString(R.string.early_of_late); break;
            case R.id.didnt_arrive: message = getString(R.string.didn_t_arrive); break;
            case R.id.im_stuck: message = getString(R.string.i_am_stuck); break;
            default:
            case R.id.another: message = getString(R.string.i_had_another_problem); break;
        }

        showToast(message);
    }

    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT ).show();
    }
}
