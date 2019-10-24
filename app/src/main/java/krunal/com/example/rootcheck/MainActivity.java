package krunal.com.example.rootcheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.scottyab.rootbeer.RootBeer;

public class MainActivity extends AppCompatActivity {

    private TextView TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView = findViewById(R.id.TextView);

         RootBeer rootBeer = new RootBeer(this);
         rootBeer.setLogging(true);
//        if (rootBeer.isRooted()) {
//            //we found indication of root
//            Log.e("isRooted", String.valueOf(rootBeer.isRooted()));
//            TextView.setText("Root Status:- Your device is Rooted.");
//        } else {
//            //we didn't find indication of root
//            Log.e("isRooted", String.valueOf(rootBeer.isRooted()));
//            TextView.setText("Root Status:- Your device is Not Rooted.");
//        }

        if (rootBeer.isRootedWithoutBusyBoxCheck()){
            //we found indication of root
            Log.e("isRootedBusyBoxCheck", String.valueOf(rootBeer.isRooted()));
            TextView.setText("Root Status:- Your device is Rooted.");

        }else {
            //we didn't find indication of root
            Log.e("isRootedBusyBoxCheck", String.valueOf(rootBeer.isRooted()));
            TextView.setText("Root Status:- Your device is Not Rooted.");
        }


    }
}
