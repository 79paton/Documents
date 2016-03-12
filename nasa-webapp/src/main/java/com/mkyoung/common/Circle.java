package com.mkyoung.common;

import java.io.Serializable;

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