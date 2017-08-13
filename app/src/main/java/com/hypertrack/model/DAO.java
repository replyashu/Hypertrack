package com.hypertrack.model;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

@Dao
public interface DAO {

    @Query("select * from UserActivity")
    LiveData<List<UserActivity>> getAllLocations();

    @Insert(onConflict =  REPLACE)
    void addUserData(UserActivity userActivity);

    @Delete
    void deleteUserData(UserActivity userActivity);

}
