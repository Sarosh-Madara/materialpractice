package com.example.saroshmadara.materialpractice5;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

/**
 * Created by Sarosh Madara on 21-11-2015.
 */
public class TestDB {
    DbConnect db;

    public TestDB(Context context ) {
        db = new DbConnect(context);
    }

    public void addProduct(Product product){
        SQLiteDatabase sqldb = db.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(db.product_name,product.getName());
        cv.put(db.product_quantity,product.getQuantity());
        sqldb.insert(db.TABLE_NAME, null, cv);
        sqldb.close();
    }

    public void removeProduct(Product product){
        SQLiteDatabase sqldb = db.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(db.product_name,product.getName());
        cv.put(db.product_quantity,product.getQuantity());
        sqldb.rawQuery("DELETE * FROM "+db.TABLE_NAME+" WHERE "+db.product_name+" = "+product.getName(),null);
    }

    public ArrayList<Product> getProductList(){
        SQLiteDatabase sqldb = db.getReadableDatabase();
        Cursor cursor = sqldb.rawQuery("SELECT * FROM " + db.TABLE_NAME, null);
        ArrayList<Product> dataList = new ArrayList<>();
        while(cursor.moveToNext()){
            Product product = new Product();
            product.setName(cursor.getString(1));
            product.setQuantity(Integer.parseInt(cursor.getString(2)));
            dataList.add(product);
        }
        sqldb.close();
        return dataList;
    }

}
