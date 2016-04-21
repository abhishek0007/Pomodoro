package gpstracking.example.com.pomodoro;

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

     public void doSomething(View v)
     {

         if(v.getId()==R.id.button)
         Log.d("Button cLick", " First  button clicked");
        else if(v.getId()==R.id.button2)
             Log.d("Button is ok"," second button is clicked");
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
