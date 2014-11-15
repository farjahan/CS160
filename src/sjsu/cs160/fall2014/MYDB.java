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
		// create table at first time

		// uid int , firstname varchar(30), lastname varchar(30),
		// email varchar(45), password varchar (45),
		// active varchar(5), pin varchar(30),
		// PRIMARY KEY(uid)
		String sql = "create table if not exists user (email varchar(30), password varchar(30), pin varchar(30)";
		db.execSQL(sql);

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) {
		// drop and create table
		db.execSQL("drop table if exists login");
		onCreate(db);
	}

}
