package gpstracking.example.com.pomodoro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

   Button b ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button)findViewById(R.id.button);
       b.setOnClickListener(this);
        Log.d("Vivz","Oncreate Activity");
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

    @Override
    public void onClick(View v) {
        Log.d("Here i am","My Button");
    }
}
