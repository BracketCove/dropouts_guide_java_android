package com.wiseassblog.dropouts_guide_java_android.errors;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.wiseassblog.dropouts_guide_java_android.R;

/**
 * Created by R_KAY on 10/21/2017.
 */

public class NoFindViewById {

    //2. Forgetting to bind a View to XML
    public class MainActivityTwo extends AppCompatActivity {

        private TextView helloWorld;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            /*
            In this case, we've neglected to call:
            someView = (TextView)findViewById(R.id.lbl_hello_world);

            This would result in an NPE.
             */

            helloWorld.setText("Hello World.");

        }
    }

}
