package sjsu.cs160.fall2014;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * A SQLiteOpenhelper to create "Pvalut.db"
 * 
 */
public class MYDB extends SQLiteOpenHelper {

	/**
	 * constructor
	 * 
	 * @param context
	 */
	public MYDB(Context context) {
		super(context, "Pvalut.db", null, 3);
		// activity, database name, , version
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		String sql = "create table if not exists user (email varchar(30), password varchar(30)";
		db.execSQL(sql);

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) {
		// drop and create table
		db.execSQL("drop table if exists login");
		onCreate(db);
	}

}
