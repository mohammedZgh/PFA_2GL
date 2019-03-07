package com.ensias.pfa.pfa;

import java.util.ArrayList;

public class EventClass {
    private int id;
    private String name;
    private String imageUri;
    private ArrayList<EventSubclass> eventSubclasses;

    public EventClass(int id, String name, String imageUri, ArrayList<EventSubclass> eventSubclasses) {
        this.id = id;
        this.name = name;
        this.imageUri = imageUri;
        this.eventSubclasses = eventSubclasses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    public ArrayList<EventSubclass> getEventSubclasses() {
        return eventSubclasses;
    }

    public void setEventSubclasses(ArrayList<EventSubclass> eventSubclasses) {
        this.eventSubclasses = eventSubclasses;
    }
}
