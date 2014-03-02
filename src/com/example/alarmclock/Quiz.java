package com.example.alarmclock;

import com.example.alarmclock.R.id;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Quiz extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.quiz);
/*		
		//テキストビューを生成し、表示する文字列をセットする
		TextView quiz = new TextView(this);
		quiz.setText("This is a text View form java file!");
		
		//テキストビューを配置するレイアウトを生成し、テキストビューをレイアウトに追加する。
		LinearLayout layout = new LinearLayout(this);
		layout.addView(quiz,new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT));
		setContentView(layout);
*/
		
		// 計算式の生成と出力
		int quizNums = 10;
		for (int i = 0; i < quizNums; i++) {
			String quizId = "quiz"+(i+1);
			Log.d("quiz","quizid :" + quizId);
			int quizIdNum = getResources().getIdentifier(quizId, "id", getPackageName());
			Log.d("quiz", "quizIdNum : " + quizIdNum);
			TextView quiz = (TextView)findViewById(quizIdNum);
			//quiz.setText("generate Auto");
		}
		
		TextView quiz1 = (TextView) findViewById(id.quiz1);
		quiz1.setText("textview from java file");
		String text = quiz1.getText().toString();
		Toast.makeText(this, text, Toast.LENGTH_LONG).show();
		
	}
		public void back(View v) {
		finish();
	}
}
