package gpstracking.example.com.pomodoro;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by abc on 4/22/2016.
 */
public class L {

    public  static void M(String m)
    {
        Log.d("msg is ",m);
    }
    public static  void S(Context c,String msg )
    {

        Toast.makeText(c, msg, Toast.LENGTH_LONG).show();
    }
}
