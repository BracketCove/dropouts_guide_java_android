package com.wiseassblog.dropouts_guide_java_android.errors;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wiseassblog.dropouts_guide_java_android.R;

import java.util.List;

/**
 * Created by R_KAY on 10/21/2017.
 */

public class NoNewKeyword {

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
}
