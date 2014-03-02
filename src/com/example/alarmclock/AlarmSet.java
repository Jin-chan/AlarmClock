package com.example.alarmclock;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class AlarmSet extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.alarm);
	}

	public void back(View v) {
		finish();
	}
	
	public void quiz(View v) {
		Log.d("set", "set alarm1");
		Intent intent = new Intent(this,Quiz.class);
		Log.d("set", "set alarm2");
		startActivity(intent);
		Log.d("set", "set alarm3");
	}

}
