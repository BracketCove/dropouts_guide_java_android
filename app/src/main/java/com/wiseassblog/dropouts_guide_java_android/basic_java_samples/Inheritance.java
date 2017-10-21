package com.wiseassblog.dropouts_guide_java_android.basic_java_samples;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wiseassblog.dropouts_guide_java_android.R;

/**
 *For beginners, don't worry too much about Inheritance. Just understand how it works, and that the primary goal is to reduce repetitive code!
 *
 * Consider if I didn't make the Animal super class, but Dog and Human still required the same Variables. That's lots of repetition; which is bad practice!
 * Created by R_KAY on 9/26/2017.
 */

public class Inheritance {

    //
    // E.G. 1
    // In this case, Animal is the Super-Class (or Parent-Class)
    public class Animal{
        //protected means sub-class can read these values, but external Classes may not.
        //Should external Classes require the values, add some Getter/Setter methods
        protected String name;
        protected int height;
        protected int weight;

        public Animal(String name, int height, int weight) {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }
    }

    //In this case, Human is a Sub-Class, or Child Class
    public class Human extends Animal {
        private int socialInsuranceNumber;

        public Human(String name, int height, int weight, int socialInsuranceNumber){
            //super() passes the arguments up the Class hierarchy. In this case, we pass
            //the arguments up to Animal, which expects Animal(name, height, weight);
            super(name, height, weight);

            this.socialInsuranceNumber = socialInsuranceNumber;
        }
    }

    //In this case, Dog is also the Sub-Class, or Child Class
    public class Dog extends Animal {
        private int dogLicenseNumber;

        public Dog(String name, int height, int weight, int dogLicenseNumber){
            super(name, height, weight);
            this.dogLicenseNumber = dogLicenseNumber;
        }
    }

    //E.G. 2

    /*
    Note that when we inherit from certain Classes, we can (and sometimes must) implement certain
    methods! A method which comes from the Super Class has an @Override annotation to indicate when
     this is required.

    Don't worry about what the Code below does/is, we'll discuss that later. Just note that onCreate
    comes from AppCompatActivity
     */
    public class NoteActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            //This time we must call a method (instead of a constructor) of the super class.
            //again, this requires the super keyword.
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

    }

}
