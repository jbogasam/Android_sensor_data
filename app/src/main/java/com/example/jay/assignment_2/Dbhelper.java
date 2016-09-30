package com.example.jay.assignment_2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * Created by jay on 9/27/2016.
 */
public class Dbhelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "Accelerometer_Stats10.db";
    public static final String TABLE_NAME = MainActivity.name.getText().toString()+"_"+MainActivity.patientID.getText().toString()+"_"+MainActivity.age.getText().toString()+"_"+MainActivity.radioButton.getText().toString();
    public static final String TIME_STAMP = "timestamp";
    public static final String X_values = "X_values";
    public static final String Y_values = "Y_values";
    public static final String Z_values = "Z_values";

    public Dbhelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db  = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + "(" + TIME_STAMP +  " TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL PRIMARY KEY ," + X_values +" REAL ," + Y_values + " REAL, " + Z_values + " REAL);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS" + TABLE_NAME);
        onCreate(db);
    }
}
