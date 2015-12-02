package com.example.saroshmadara.materialpractice5;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Sarosh Madara on 21-11-2015.
 */
public class DbConnect extends SQLiteOpenHelper {
    public static String DB_NAME = "PRODUCTION.db";
    public static int DB_VERSION = 1;
    public String TABLE_NAME = "Product";

    public String product_id = "ProductID";
    public String product_name = "Name";
    public String product_quantity = "Quantity";

    public String CREATE = "CREATE TABLE IF NOT EXISTS "+TABLE_NAME+"("+product_id+" INTEGER PRIMARY KEY AUTOINCREMENT,"+product_name+" TEXT,"+product_quantity+" INTEGER) ";
    public String DELETE = "DROP TABLE IF EXISTS "+TABLE_NAME;

    public DbConnect(Context context) {
        super(context, DB_NAME, null, DB_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DELETE);
        onCreate(db);
    }
}
