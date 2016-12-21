package nyc.c4q.shannonalexander_navarro.housejson;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) { //this will protect the state when it's rotated
            FragmentManager fm = getSupportFragmentManager();
            fm.beginTransaction().add(R.id.activity_main, new HouseFragment()).commit();
        }
    }
}
