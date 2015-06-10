package com.wordpress.thecaffeinatedtanuki.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Context;


public class MyAppPortfolio extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_app_portfolio);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my_app_portfolio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
/*
      public void toastMethod1(View v) {
          tToast("This button will launch my Spotify Streamer App!");
      }

      public void toastMethod2(View v) {
          tToast("This button will launch my Football Scores App!");
      }

      public void toastMethod3(View v) {
          tToast("This button will launch my Library App!");
      }

      public void toastMethod4(View v) {
          tToast("This button will launch my Build It Bigger App!");
      }

      public void toastMethod5(View v) {
          tToast("This button will launch my XYZ Reader App!");
      }

      public void toastMethod6(View v) {
          tToast("This button will launch my Capstone App!");
      }

      private void tToast(String text) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
*/

    public void toastMethod(View view){
        Button button = (Button) view;
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my " + button.getText() + " app!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

};

