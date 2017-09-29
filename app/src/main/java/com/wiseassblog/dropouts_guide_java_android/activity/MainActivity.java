package com.wiseassblog.dropouts_guide_java_android.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.wiseassblog.dropouts_guide_java_android.R;

/*
Activities are the primary building blocks of Android Applications.
*/

public class MainActivity extends AppCompatActivity {

    private TextView helloWorld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //The method below creates the User Interface from activity_main.xml
        setContentView(R.layout.activity_main);

        //This is how you bind a View from an XML file to a Variable in java Code.
        //Once bound, we may call it's methods to manipulate the UI
        helloWorld = (TextView) findViewById(R.id.lbl_hello_world);

        /*
        Q: Why does it say (TextView)?
        A: The findViewById(int) method returns a View. Since TextView is a sub-class
        of View, we may treat it as either a View or a TextView. However, in most cases
        you'll want to treat it as it's specialized Class, in order to call methods like
        setText()
         */

    }
}
