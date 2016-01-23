package com.bigbeautifulcode.rngtracker;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by jacob on 1/23/16.
 */
public class DBHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "RNGTrackerDB";

    //Common Column Names
    public static final String KEY_ID = "id";

    //Collection Table
    public static final String COLLECTION_TABLE_NAME = "collection";
    public static final String COLLECTION_COLUMN_COUNT = "count";
    public static final String COLLECTION_COLUMN_DECK_ID = "deckId";

    //Deck Table
    public static final String DECK_TABLE_NAME = "deck";
    public static final String DECK_COLUMN_NAME = "name";
    public static final String DECK_COLUMN_CARD_ID = "cardId";

    //Card Table
    public static final String CARD_TABLE_NAME = "card";
    public static final String CARD_COLUMN_NAME = "name";
    public static final String CARD_COLUMN_COST = "cost";
    public static final String CARD_COLUMN_DESCRIPTION = "description";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
