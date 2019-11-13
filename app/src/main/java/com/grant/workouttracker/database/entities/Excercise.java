package com.grant.workouttracker.database.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Excercise {
    @PrimaryKey
    public int uuid;

    @ColumnInfo(name = "name")
    public String name;
}
