package com.example.ffulgencio.escribedb;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ffulgencio on 7/14/2016.
 */
public class DataBaseHelper extends SQLiteOpenHelper {

    String sql ="CREATE TABLE productos(id integer primary key autoincrement,descripcion text, categoria text,precio integer);";

    public DataBaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
