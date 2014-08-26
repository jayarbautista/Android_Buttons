package com.android.exercises.simplebuttons;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SimpleButtonActivity extends ActionBarActivity {
	
	private String mMessage;
	
	TextView mText;
	Button mOkButton;
	Button mCancelButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_simple_button);

		mText = (TextView)findViewById(R.id.tvOut);
		mOkButton = (Button)findViewById(R.id.ok_button);
		mCancelButton = (Button)findViewById(R.id.cancel_button);

		mOkButton.setOnClickListener(mOnClick);
		mCancelButton.setOnClickListener(mOnClick);
	}
	
	OnClickListener mOnClick = new OnClickListener() {
		@Override
		public void onClick(View v) {
			switch(v.getId()) {
			case(R.id.ok_button):
				mText.setText("OK: Hello World.");
				break;
			case(R.id.cancel_button):
				mText.setText("Cancel: Hello World.");
				break;
			}

			mMessage = (String) mText.getText();
			Toast.makeText(getApplicationContext(), mMessage, Toast.LENGTH_SHORT).show();
		}
	};
}
