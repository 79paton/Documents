package com.mkyoung.common;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by 79Paton on 12/03/2016.
 *
 */

public class Coords implements Serializable {

    private static final long serialVersionUID = 20111020L;
    private double latitude;
    private double longitude;

    private Date date;

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
