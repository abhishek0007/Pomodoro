package gpstracking.example.com.pomodoro;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.io.File;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void NextActivity(View v)
    {
        Intent i = new Intent(this,Main22Activity.class);
        startActivity(i);

    }
    public  void process(View v)
    {
        Intent i = null,cho=null;
            if(v.getId()==R.id.button2)
            {
                i = new  Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse("geo:28.38,77.12"));
                cho = i.createChooser(i,"Launch map");
                startActivity(cho);

            }
            else if(v.getId()==R.id.button3)
            {
                i = new  Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.kiloo.subwaysurf&hl=en"));
                cho = i.createChooser(i,"Launch map");
                startActivity(cho);

            }else if(v.getId()==R.id.button4)
            {
                Uri img = Uri.parse("android.resource://app/res/drawable/"+R.drawable.amazon);
                i = new Intent(i.ACTION_SEND);
                    i.setType("image/*");
                i.putExtra(i.EXTRA_STREAM, img);
                cho = i.createChooser(i,"Launch map");
                startActivity(cho);

            }
        else if(v.getId()==R.id.button5)
                {
             File picture =    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
                String[] listOfPicture = picture.list();
                for(String pictu:listOfPicture)
                {
                    L.S(this,pictu);
                }



            }
    }


}
