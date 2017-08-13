package com.hypertrack.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

@Entity
public class UserActivity {

    @PrimaryKey(autoGenerate = true)
    public int id;

    private String timeStamp;
    private String location;
    private String user_activity;

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUser_activity() {
        return user_activity;
    }

    public void setUser_activity(String user_activity) {
        this.user_activity = user_activity;
    }
}
