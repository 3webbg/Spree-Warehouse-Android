package com.example.androidspreewarehouse.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

	private static  SQLiteDatabase sqliteDb;
    private static  DatabaseHelper instance;
    private static final int DATABASE_VERSION = 1;
    public static String DATABASE_NAME = "userdatabase.sqlite";
    private static String DB_PATH_PREFIX = "/data/data/";
    private static String DB_PATH_SUFFIX = "/databases/";
    private static final String TAG = "DataBaseHelper";
    private static Context context;
	
	public DatabaseHelper(Context context, String name, CursorFactory factory, int version) {
		super(context, name, factory, version);

	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL("CREATE TABLE user_data ( " +
				"_id INTEGER PRIMARY KEY NOT NULL, " +
				"server_name TEXT, " +
				"user VARCHAR(30), " +
				"api_key TEXT ");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

		
	}

}
