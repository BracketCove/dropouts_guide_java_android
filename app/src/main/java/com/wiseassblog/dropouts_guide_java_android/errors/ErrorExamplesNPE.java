package com.wiseassblog.dropouts_guide_java_android.errors;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.wiseassblog.dropouts_guide_java_android.R;
import com.wiseassblog.dropouts_guide_java_android.basic_java_samples.NestedClass;

import java.util.List;

/**
 * Created by R_KAY on 9/29/2017.
 */

public class ErrorExamplesNPE {

    //1. Forgetting to create an object
    public class MainActivityOne extends AppCompatActivity {

        private List<SimpleHuman> exercises;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            /*In this example, we've created a new SimpleHuman, but
            we haven't created a new List Object. This will throw an NPE.
            This could be fixed by adding exercises = new ArrayList<>();
            before exercises.add(...);
            */

            exercises.add(
                    new SimpleHuman("Bob", "10/10/1986")
            );


        }
    }

    public class SimpleHuman {
        private String name;
        private String birthDate;

        public SimpleHuman(String name, String birthDate) {
            this.name = name;
            this.birthDate = birthDate;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getBirthDate() {
            return birthDate;
        }

        public void setBirthDate(String birthDate) {
            this.birthDate = birthDate;
        }
    }

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
