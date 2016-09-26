package com.maqianyu.carhome.model.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by dllo on 16/9/26.
 */
public class SQHelper extends SQLiteOpenHelper {
    public static final String TABLE_NAME  = "carHome";
    public static final String CoLUMN_NAME  = "name";
    public SQHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sqUrl = "create table " + TABLE_NAME + " (id integer primary key autoincrement," + CoLUMN_NAME + " text)";
        db.execSQL(sqUrl);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
