package com.aurora.ieusec.model;

public class ForecastIoResponse {

    private float latitude;
    private float longitude;
    private String timezone;
    private int offset;
    private Currently currently;
    private Daily daily;

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public String getTimezone() {
        return timezone;
    }

    public int getOffset() {
        return offset;
    }

    public Currently getCurrently() {
        return currently;
    }

    public Daily getDaily() {
        return daily;
    }
}