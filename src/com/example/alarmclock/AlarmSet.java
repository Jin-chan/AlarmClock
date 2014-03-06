package com.example.alarmclock;

import java.util.Calendar;

import com.example.alarmclock.R.id;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class AlarmSet extends Activity {
	int hour,minute;
	
	protected void onCreate(Bundle savedInstanceState) {
		Log.d("alerm", "call AlarmSet.java");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.alarm);
		
		Intent intent = getIntent();
		hour = intent.getIntExtra("alermHour", 0);
		minute = intent.getIntExtra("alermMinute",0);
		
		// アラーム設定時間の表示
		TextView setAlermTime = (TextView)findViewById(id.setAlarmTime);
		setAlermTime.setText("設定時間 : " + hour + ":" + minute);
		
		//makeDialog();

		// ---
		// ダイアログの表示
		// ---
		AlertDialog.Builder alermDialog = new AlertDialog.Builder(this);
		
		// ダイアログの設定
		alermDialog.setTitle("アラーム設定時間");
		alermDialog.setMessage("時間です。Quiz を開始してアラームを止めましょう");

		
		 // 第1引数(String)	ボタン上に表示する文言を文字列型で指定
		 // 第2引数(DialogInterface.OnClickListener)	ボタン押下時のイベントを取得するためのリスナーを登録
		 
		
		alermDialog.setPositiveButton("Start",new DialogInterface.OnClickListener(){
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				Log.d("AlertDialog", "この後画面遷移 ");
				quiz(dialog);
			}
		});


		// ダイアログの作成と描画
		//alermDialog.create();
		alermDialog.show();
		
		/*
		// AlramManager取得
		AlarmManager am = (AlarmManager)getSystemService(ALARM_SERVICE); 
		// AlramManagerにPendingIntentを登録
		am.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), sender); 
		*/
		
		//=============================-
		
		
		// 指定時間に処理を発生
		/*
		Intent i = new Intent(getApplicationContext(), ReceivedActivity.class); // ReceivedActivityを呼び出すインテントを作成
		PendingIntent sender = PendingIntent.getBroadcast(AlarmSet.this, 0, i, 0); // ブロードキャストを投げるPendingIntentの作成

		Calendar calendar = Calendar.getInstance(); // Calendar取得
		calendar.setTimeInMillis(System.currentTimeMillis()); // 現在時刻を取得
		calendar.add(Calendar.SECOND, 5); // 現時刻より5秒後を設定
		AlarmManager am = (AlarmManager)getSystemService(ALARM_SERVICE); // AlramManager取得
		am.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), sender); // AlramManagerにPendingIntentを登録
		*/
	}

	public void back(View v) {
		finish();
	}

	public void quiz(View v) {
		// 遷移先のactivityを指定してintentを作成
		Intent intent = new Intent(this,Quiz.class);
		// 指定のactivityを開始する
		startActivity(intent);
	}
	
	public void quiz(DialogInterface v){
		Intent intent = new Intent(this,Quiz.class);
		startActivity(intent);
	}
	
	public void makeDialog(){
		// ---
		// ダイアログの表示
		// ---
		AlertDialog.Builder alermDialog = new AlertDialog.Builder(this);
		
		// ダイアログの設定
		alermDialog.setTitle("アラーム設定時間");
		alermDialog.setMessage("時間です。Quiz を開始してアラームを止めましょう");

		/*
		 * 第1引数(String)	ボタン上に表示する文言を文字列型で指定
		 * 第2引数(DialogInterface.OnClickListener)	ボタン押下時のイベントを取得するためのリスナーを登録
		 */
		
		alermDialog.setPositiveButton("Start",new DialogInterface.OnClickListener(){
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				Log.d("AlertDialog", "この後画面遷移 ");
				quiz(dialog);
			}
		});
		
		// ダイアログの作成と描画
		alermDialog.create();
		//alermDialog.show();
	}
}
