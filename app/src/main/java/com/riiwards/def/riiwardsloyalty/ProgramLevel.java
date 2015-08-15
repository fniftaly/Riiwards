package com.riiwards.def.riiwardsloyalty;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ProgramLevel extends Activity implements View.OnClickListener{
    Button su;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program_level);
        su = (Button)findViewById(R.id.btn_su);
        su.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_program_level, menu);
        return true;
    }

    private void signUppage(){
        startActivity(new Intent("com.riiwards.def.riiwardsloyalty.SignInActivity"));
    }

    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_su:
                signUppage();
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
