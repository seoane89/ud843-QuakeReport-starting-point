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
    private String mMagnitude;
    //Location of the earthquake
    private String mPlace;
    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    public Earthquake(String magnitude, String place, long timeInMiliseconds) {
    mMagnitude = magnitude;
    mPlace = place;
    mTimeInMilliseconds = timeInMiliseconds;
    }
    public String getMagnitude() { return mMagnitude; }
    public String getPlace() { return mPlace; }
    public long getTimeInMilliseconds() { return mTimeInMilliseconds; }
}
