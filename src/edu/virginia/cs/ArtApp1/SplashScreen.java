package edu.virginia.cs.ArtApp1;

import edu.virginia.cs.ArtApp.R;
import edu.virginia.cs.ArtApp.R.layout;
import edu.virginia.cs.ArtApp.R.menu;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.os.Handler;


public class SplashScreen extends Activity {

    private static int SPLASH_TIME_OUT = 1000;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash_screen);
 
		new Handler().postDelayed(new Runnable() {
        	 
            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */
            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(SplashScreen.this, LoginActivity.class);
                startActivity(i);
                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.splash_screen, menu);
		return true;
	}

}