package gpstracking.example.com.pomodoro;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void button1(View view)
    {
        Intent browserIntent =  new Intent(Intent.ACTION_VIEW, Uri.parse("http://currentaffairs.gktoday.in/current-affairs/chhattisgarh\n" +
                "\n" +
                "fb"));
        startActivity(browserIntent);
    }

    public void button2(View view)
    {
        Intent browserIntent =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/cggyanstrita/"));
        startActivity(browserIntent);
    }
    public void button3(View view)
    {
        Intent browserIntent =  new Intent(Intent.ACTION_VIEW, Uri.parse(
                "http://www.allexamgurublog.com/2015/03/chhattisgarh-objective-gk-questions-and.html"));
        startActivity(browserIntent);
    }
    public void button4(View view)
    {
        Intent browserIntent =  new Intent(Intent.ACTION_VIEW, Uri.parse(
                "http://www.cggkquiz.in/p/blog-page.html"));
        startActivity(browserIntent);
    }

    public void button5(View view)
    {
        Intent browserIntent =  new Intent(Intent.ACTION_VIEW, Uri.parse(
                "http://www.mahanadiacademy.com/OldPaper"));
        startActivity(browserIntent);
    }


}
