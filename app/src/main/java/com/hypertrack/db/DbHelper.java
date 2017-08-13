package com.hypertrack.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by apple on 13/08/17.
 */

public class DbHelper extends SQLiteOpenHelper {

    // Logcat tag
    private static final String LOG = "DatabaseHelper";

    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "location";

    // Table Names
    private static final String TABLE_ACTIVITY = "activities";
    private static final String TABLE_LOCATION = "locations";
    private static final String TABLE_MAP = "map";

    // Common column names
    private static final String KEY_ID = "id";
    private static final String KEY_CREATED_AT = "created_at";

    // activity Table - column names
    private static final String KEY_LOCATION = "location";

    private static final String KEY_ACTIVITY = "activity";

    private static final String KEY_LOCATION_ID = "location_id";
    private static final String KEY_ACTIVITY_ID = "activity_id";


    // Table Create Statements
    // Todo table create statement
    private static final String CREATE_TABLE_ACTIVITY = "CREATE TABLE "
            + TABLE_ACTIVITY + "(" + KEY_ID + " INTEGER PRIMARY KEY," + KEY_ACTIVITY
            + " TEXT," + KEY_CREATED_AT
            + " DATETIME" + ")";

    // Tag table create statement
    private static final String CREATE_TABLE_LOCATION = "CREATE TABLE " + TABLE_LOCATION
            + "(" + KEY_ID + " INTEGER PRIMARY KEY," + KEY_LOCATION + " TEXT,"
            + KEY_CREATED_AT + " DATETIME" + ")";

    // todo_tag table create statement
    private static final String CREATE_TABLE_ACTIVITY_TAG = "CREATE TABLE "
            + TABLE_MAP + "(" + KEY_ID + " INTEGER PRIMARY KEY,"
            + KEY_ACTIVITY_ID + " INTEGER," + KEY_LOCATION_ID + " INTEGER,"
            + KEY_CREATED_AT + " DATETIME" + ")";

    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_ACTIVITY);
        db.execSQL(CREATE_TABLE_LOCATION);
        db.execSQL(CREATE_TABLE_ACTIVITY_TAG);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_ACTIVITY);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_LOCATION);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_MAP);

        // create new tables
        onCreate(db);
    }
}
