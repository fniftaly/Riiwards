package com.riiwards.def.riiwardsloyalty;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.graphics.Color;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends Activity implements View.OnClickListener{

    Button btn_su, btn_advanced,btn_premium;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button basic = (Button)findViewById(R.id.btn_basic);

        basic.setOnClickListener(this);
//
    }

    private void callActivity(){
        startActivity(new Intent("com.riiwards.def.riiwardsloyalty.ProgramLevel"));
    }

        public void onClick(View v) {
            switch(v.getId()){
                case R.id.btn_basic:
                    callActivity();
                    break;
                case R.id.btn_advanced:
                    //DO something
                    break;
                case R.id.btn_premium:
                    //DO something
                    break;
            }
        }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
