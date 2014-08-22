package com.android.exercises.simplebuttons;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class SimpleButtonActivity extends ActionBarActivity {
	private static final String TAG = "SimpleButtonActivity";
	TextView mText;
	Button mOkButton;
	Button mCancelButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_simple_button);
		Log.d(TAG, "Find view elements");
		mText = (TextView) findViewById(R.id.tvOut);
		mOkButton = (Button) findViewById(R.id.ok_button);
		mCancelButton = (Button) findViewById(R.id.cancel_button);
		Log.d(TAG, "Set listener to buttons");
		mOkButton.setOnClickListener(mOnClick);
		mCancelButton.setOnClickListener(mOnClick);
	}

	OnClickListener mOnClick = new OnClickListener() {
		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case (R.id.ok_button):
				Log.d(TAG, "Clicked: OK button");
				mText.setText("Button OK was clicked.");
				break;
			case (R.id.cancel_button):
				Log.d(TAG, "Clicked: Cancel button");
				mText.setText("Button Cancel was clicked.");
				break;
			}
		}
	};
}