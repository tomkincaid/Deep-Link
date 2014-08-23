package com.example.deeplink;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

public class GizmosActivity extends Activity {
	
public static String TAG = "debug";
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	    Intent intent = getIntent();
	    String action = intent.getAction();
	    Uri data = intent.getData();
	    Log.v(TAG,action+" "+data.toString());
	}

}
