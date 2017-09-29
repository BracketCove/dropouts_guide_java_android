package com.wiseassblog.dropouts_guide_java_android.basic_java_samples;

import java.util.ArrayList;
import java.util.List;

/**
 * Classes are arrangements of Variables and Methods which make up a Working Application. It helps
 * to think of and design them in a way similar to real-world Objects.
 * Created by R_KAY on 9/26/2017.
 */

public class ClassesAndObjects {
    /*
    E.G. 1
    A Human being, represented as a Class.
     */
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

    /*
    E.G. 2
    A slightly more complicated Human Being represented as a Class
     */
    public class ComplexHuman {
        private String firstName;
        private String lastName;
        private String birthDate;
        private int height;
        private long socialInsuranceNumber;
        private int telephoneNumber;
        private List<ComplexHuman> relatives;

        //...Constructor, Getters, Setters

        public void setRelatives(List<ComplexHuman> relatives){
            this.relatives = relatives;
        }
    }

    /*
    E.G. 3
    At runtime, our Classes can become "Objects", which exist for a given time and can be
    manipulated via Methods. Object is a short hand word for "an Instance of a Class".

    Below, we are passing an Instance of SimpleHuman in to a method, and adding it to an Instance of
    ArrayList.
     */
    private ArrayList<SimpleHuman> listOfHumans = new ArrayList<>();


    public void addNewHumanToList(SimpleHuman human){
        listOfHumans.add(human);
    }
}
