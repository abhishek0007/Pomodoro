package gpstracking.example.com.pomodoro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Vivz","Oncreate Activity");
    }


    public void gotoNexr(View v)
    {
        Intent i = new Intent(this,Main2Activity.class);
        startActivity(i);

    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Vivz","OnResumeActivity");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Vivz", "OnStartActivity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Vivz", "OnPauseActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Vivz", "OnStopActivity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Vivz", "OnRestartActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Vivz", "OnDestroyActivity");
    }


}
