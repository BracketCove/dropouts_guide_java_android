package com.wiseassblog.dropouts_guide_java_android.basic_java_samples;

/**
 * A Set of a given exercise.
 * Created by R_KAY on 9/27/2017.
 */

public class Set {
    private int weight;
    private int reps;

    public Set(int weight, int reps) {
        this.weight = weight;
        this.reps = reps;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }
}
