package com.hypertrack.map;

import com.google.android.gms.maps.GoogleMap;


public abstract class MapPresenter extends BaseFlow{

    public abstract void onBackPressed();

    public abstract void cancelButtonClicked();

    public abstract void continueButtonClicked();

    public abstract void onMapReady(GoogleMap map);

    public abstract void initialize();

    public abstract void onResume();

    public abstract void onStop();

    public abstract void onPause();

    public abstract void stopCollection();

    public abstract void startCollection();

}
