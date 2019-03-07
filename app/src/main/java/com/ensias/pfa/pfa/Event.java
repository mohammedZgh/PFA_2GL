package com.ensias.pfa.pfa;

import android.net.Uri;
import java.util.Date;

public class Event {
    private int id ;
    private int state;
    private User user ;
    private String title;
    private String description;
    private String location;
    private Uri imageUri;
    private Date date;
    private int interested;
    private double ticketPrice ;
    private EventClass eventClass ;
    private EventSubclass eventSubclass;

    public Event(int id, int state, User user, String title, String description, String location, Uri imageUri, Date date, int interested, double ticketPrice, EventClass eventClass, EventSubclass eventSubclass) {
        this.id = id;
        this.state = state;
        this.user = user;
        this.title = title;
        this.description = description;
        this.location = location;
        this.imageUri = imageUri;
        this.date = date;
        this.interested = interested;
        this.ticketPrice = ticketPrice;
        this.eventClass = eventClass;
        this.eventSubclass = eventSubclass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Uri getImageUri() {
        return imageUri;
    }

    public void setImageUri(Uri imageUri) {
        this.imageUri = imageUri;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getInterested() {
        return interested;
    }

    public void setInterested(int interested) {
        this.interested = interested;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public EventClass getEventClass() {
        return eventClass;
    }

    public void setEventClass(EventClass eventClass) {
        this.eventClass = eventClass;
    }

    public EventSubclass getEventSubclass() {
        return eventSubclass;
    }

    public void setEventSubclass(EventSubclass eventSubclass) {
        this.eventSubclass = eventSubclass;
    }
}
