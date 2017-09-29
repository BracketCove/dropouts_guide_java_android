package com.wiseassblog.dropouts_guide_java_android.basic_java_samples;

import java.util.List;

/**
 * Created by R_KAY on 9/27/2017.
 */

public class NestedClass {

    public class Exercise {

        private String exerciseName;

        //When designing DataModels, we may include nested classes and Lists within, as so:
        private List<Set> exerciseSets;

        public Exercise(String exerciseName, List<Set> exerciseSets) {
            this.exerciseName = exerciseName;
            this.exerciseSets = exerciseSets;
        }

        public String getExerciseName() {
            return exerciseName;
        }

        public void setExerciseName(String exerciseName) {
            this.exerciseName = exerciseName;
        }

        public List<Set> getExerciseSets() {
            return exerciseSets;
        }

        public void setExerciseSets(List<Set> exerciseSets) {
            this.exerciseSets = exerciseSets;
        }
    }
}
