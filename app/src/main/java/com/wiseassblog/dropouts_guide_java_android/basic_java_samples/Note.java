package com.wiseassblog.dropouts_guide_java_android.basic_java_samples;

/**
 * This is a DataModel or POJO (in Java).
 * Created by R_KAY on 10/21/2017.
 */

public class Note {
    private final String creationDate;
    private String noteContents;

    //Constructor
    public Note(String creationDate, String noteContents) {
        this.creationDate = creationDate;
        this.noteContents = noteContents;
    }

    //Getters
    public String getCreationDate() {
        return creationDate;
    }

    public String getNoteContents() {
        return noteContents;
    }

    //Setter
    public void setNoteContents(String noteContents) {
        this.noteContents = noteContents;
    }
}
