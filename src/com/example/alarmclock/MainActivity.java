package com.example.alarmclock;

import com.example.alarmclock.R.id;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.WindowManager.LayoutParams;
import android.widget.TimePicker;

public class MainActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.d("alerm", "call MainActivity.java");
		super.onCreate(savedInstanceState);
		this.getWindow().setSoftInputMode(LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
		setContentView(R.layout.activity_main);
		
		// 24時間表示に変更
		TimePicker alermTime = (TimePicker)findViewById(id.alarmTime); 
		alermTime.setIs24HourView(true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void setAlarm(View v) {
		Intent intent = new Intent(this,AlarmSet.class);

		// TimePickerインスタンスを取得
		TimePicker alermTime = (TimePicker)findViewById(id.alarmTime);
		int hour = alermTime.getCurrentHour();
		int min = alermTime.getCurrentMinute();

		// intentで値を保持
		intent.putExtra("alermHour",hour);
		intent.putExtra("alermMinute", min);
		//intent.putExtra("alermTime", alermTime)
		startActivity(intent);
	}

}
