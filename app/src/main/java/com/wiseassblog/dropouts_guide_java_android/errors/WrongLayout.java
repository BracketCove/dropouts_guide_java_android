package com.wiseassblog.dropouts_guide_java_android.errors;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.wiseassblog.dropouts_guide_java_android.R;

/**
 * Created by R_KAY on 10/21/2017.
 */

public class WrongLayout {

    //3. Inflating wrong Layout
    public class MainActivityThree extends AppCompatActivity {

        private TextView helloWorld;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            /*
            This one is a little trickier to catch sometimes.
             */

            //totally not the correct layout to inflate
            setContentView(R.layout.views_with_styles_good_practice);

            /*
            In this case, we've done everything correct to bind a View, but we're providing the
            wrong Layout for the Activity to inflate. You're first idea may be to check the Layout
            you think you're inflating (activity_main.xml), only to see that lbl_hello_world does
            indeed exist.

            This can occur when copy-pasting lots of code.
             */

            helloWorld = (TextView)findViewById(R.id.lbl_hello_world);
            helloWorld.setText("Hello World.");

        }
    }
}
