package com.example.android.willitfit;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;


/**
 * add javadoc commentas
  */

public class MainActivity extends AppCompatActivity {

    public static Activity mainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*
        //Remove title bar - removed in styles
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        //Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);*/

        setContentView(R.layout.activity_main);

        mainActivity=this;
    }

    public void newGame(View view)
    {
        Intent intent = new Intent(getApplicationContext(), NewGame.class);
        startActivity(intent);
    }

    public void closeApp(View view)
    {
        System.exit(0);
    }
}
