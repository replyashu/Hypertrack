package com.hypertrack.user;

import android.app.IntentService;
import android.content.Intent;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.NotificationCompat;
import android.util.Log;

import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import com.hypertrack.R;
import com.hypertrack.utils.Constants;

import java.util.ArrayList;
import java.util.List;


public class TrackingService extends IntentService{
    String userActivity;


    public TrackingService() {
        super("ActivityRecognizedService");
    }

    public TrackingService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(Intent intent) {


        if(ActivityRecognitionResult.hasResult(intent)) {
            ActivityRecognitionResult result = ActivityRecognitionResult.extractResult(intent);
            Intent i = new Intent(Constants.STRING_ACTION);

            ArrayList<DetectedActivity> detectedActivities = (ArrayList) result.getProbableActivities();

            i.putExtra(Constants.STRING_EXTRA, detectedActivities);
            LocalBroadcastManager.getInstance(this).sendBroadcast(i);
        }

    }


}