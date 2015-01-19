package com.example.student.lab01;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class Lab01Activity extends ActionBarActivity {

    int counter = 0 ;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            //This method is called once when the activity starts//
        super.onCreate(savedInstanceState);
            //To load the UI layout from res/layout/activity.main.xml//
        setContentView(R.layout.activity_lab01);

        tv = (TextView)findViewById(R.id.textView2);
    }

    public void buttonClicked(View v)
    {
        TextView tv;
        tv = (TextView)findViewById(R.id.textView);
        //tv refers to the TextView widget in the layout//
        tv.setText("The Button is clicked!");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_lab01, menu);
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


    public void add(View v)
    {
        counter++;
        tv.setText(counter+"");
    }

    public void minus(View v)
    {
        counter--;
        tv.setText(counter+"");
    }
}
