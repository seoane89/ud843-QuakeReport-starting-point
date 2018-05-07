package com.example.android.quakereport;

/**
 * Created by ti6a on 26-Apr-18.
 */

/**
 * @link Earthquake is a custom object that contains information about earthquakes
 * each object contains information about the magnitude, place and time of an earthquake
 */

public class Earthquake {
    // Magnitude of the earthquake
    private double mMagnitude;
    //Location of the earthquake
    private String mLocation;
    /** Time of the earthquake */
    private long mTimeInMilliseconds;
    // URL of the earthquake
    private String mUrl;

    public Earthquake(double magnitude, String location, long timeInMiliseconds, String url) {
    mMagnitude = magnitude;
    mLocation = location;
    mTimeInMilliseconds = timeInMiliseconds;
    mUrl = url;
    }
    public double getMagnitude() { return mMagnitude; }
    public String getLocation() { return mLocation; }
    public long getTimeInMilliseconds() { return mTimeInMilliseconds; }
    public String getUrl() { return mUrl; }
}
