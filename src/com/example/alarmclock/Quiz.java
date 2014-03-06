package com.example.alarmclock;

import com.example.alarmclock.R.id;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Quiz extends Activity {
	int[] ans = new int[10];
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.quiz);

		// 計算式の生成と出力
		int quizNums = 10;
		String quizId;
		
		int num1[] = makeInt();
		int num2[] = makeInt();
		
		for (int i = 0; i < quizNums; i++) {
			
			ans[i] = num1[i] + num2[i];
			
			quizId = "quiz"+(i+1);
			int quizIdNum = getResources().getIdentifier(quizId, "id", getPackageName());
			TextView quiz = (TextView)findViewById(quizIdNum);
			quiz.setText(num1[i] + " + " + num2[i] + " = " + ans[i] );
		}
	}
	
	// 正誤判定
	public void check(View v){
		Log.d("alerm", "call check");
		int check=0;
		int wrong=0;
		String ansId;
		
		for(int var = 1;var < 11 ; var++ ){
			ansId = "ans" + var;
			int ansNum = getResources().getIdentifier(ansId, "id", getPackageName());
			EditText ansIｎput = (EditText)findViewById(ansNum);
			SpannableStringBuilder ansInputNum = (SpannableStringBuilder)ansIｎput.getText();
			int inputNum = Integer.parseInt(ansInputNum.toString());
			
			if(this.ans[var-1] != inputNum){
//				check = 1;
				Log.d("alerm","wrong ans no." + var);
				wrong += 1;
			}else{
				Log.d("alerm","collect ans no." + var);
			}
		AlertDialog.Builder result = new AlertDialog.Builder(this);
		result.setTitle("結果");
		result.setMessage("10問中"+ (10-wrong) + "正解");
		
		result.setPositiveButton("OK",new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		});
		result.show();
		}
//		return check;
	}
	

	// 計算式生成のための値を生成
	public static int[] makeInt(){
		int[] random = new int[10];
		for(int var = 0 ; var <10 ; var++){
			random[var]= (int)(Math.random()*100);
		}
		return random;
	}
	
	public void back(View v) {
		finish();
	}
}
