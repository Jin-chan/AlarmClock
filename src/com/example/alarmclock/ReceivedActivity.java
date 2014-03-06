package com.example.alarmclock;

import java.security.PublicKey;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.provider.AlarmClock;
import android.util.Log;
import android.widget.Toast;

public class ReceivedActivity extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent)
    {
        //Toast.makeText(context, "called ReceivedActivity", Toast.LENGTH_SHORT).show();
    	Log.d("alerm","this");
    	
    	/*
    	  AlertDialog.Builder alermDialog = new AlertDialog.Builder(context);
    	alermDialog.setTitle("アラーム設定時間");
		alermDialog.setMessage("時間です。Quiz を開始してアラームを止めましょう");

		alermDialog.setPositiveButton("Start",new DialogInterface.OnClickListener(){
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				Log.d("AlertDialog", "この後画面遷移 ");
			}
		});
		alermDialog.show();
		*/
   	}
}