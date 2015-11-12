package com.aurora.ieusec.model;

/**
 * Created by sinan on 12.11.2015.
 */
public class Currently {

    private int time;
    private String summary;
    private String icon;
    private int nearestStormDistance;
    private int nearestStormBearing;
    private int precipIntensity;
    private int precipProbability;
    private float temperature;
    private float apparentTemperature;
    private float dewPoint;
    private float humidity;
    private float windSpeed;
    private int windBearing;
    private float visibility;
    private float cloudCover;
    private float pressure;
    private float ozone;

    public int getTime() {
        return time;
    }

    public String getSummary() {
        return summary;
    }

    public String getIcon() {
        return icon;
    }

    public int getNearestStormDistance() {
        return nearestStormDistance;
    }

    public int getNearestStormBearing() {
        return nearestStormBearing;
    }

    public int getPrecipIntensity() {
        return precipIntensity;
    }

    public int getPrecipProbability() {
        return precipProbability;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getApparentTemperature() {
        return apparentTemperature;
    }

    public float getDewPoint() {
        return dewPoint;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getWindSpeed() {
        return windSpeed;
    }

    public int getWindBearing() {
        return windBearing;
    }

    public float getVisibility() {
        return visibility;
    }

    public float getCloudCover() {
        return cloudCover;
    }

    public float getPressure() {
        return pressure;
    }

    public float getOzone() {
        return ozone;
    }
}
