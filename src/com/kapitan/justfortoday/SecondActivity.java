package com.kapitan.justfortoday;

import com.roof.justfortoday.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

public class SecondActivity extends Activity {

	WebView mWebView;
	@Override

	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_second);
	            
	    mWebView = (WebView) findViewById(R.id.webview);
		// включаем поддержку JavaScript
	    mWebView.getSettings().setJavaScriptEnabled(true);
		// указываем страницу загрузки
	    mWebView.loadUrl("file:///android_asset/help.html"); 
	}

	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}



