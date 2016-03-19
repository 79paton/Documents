package com.mkyoung.common;

import sun.util.calendar.BaseCalendar;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by 79Paton on 12/03/2016.
 *
 */

public class Circle implements Serializable {

    private static final long serialVersionUID = 20111020L;

    private int radius;
    private String backgroundColor;
    private String borderColor;
    private double scaleFactor;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    private Timestamp timestamp;


//    public Date getDate() {
//        return date;
//    }
//
//    public void setDate(Date date) {
//        this.date = date;
//    }

    public final int getRadius() {
        return radius;
    }

    public final void setRadius(int radius) {
        this.radius = radius;
    }

    public final String getBackgroundColor() {
        return backgroundColor;
    }

    public final void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public final String getBorderColor() {
        return borderColor;
    }

    public final void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public final double getScaleFactor() {
        return scaleFactor;
    }

    public final void setScaleFactor(double scaleFactor) {
        this.scaleFactor = scaleFactor;
    }
}
