package com.riiwards.def.riiwardsloyalty;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class SignInActivity extends Activity implements View.OnClickListener{

    Button btn_panchcard, btn_progdiscount, btn_altdiscount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        btn_panchcard = (Button)findViewById(R.id.punchcard);
        btn_panchcard.setOnClickListener(this);

        btn_progdiscount = (Button)findViewById(R.id.progdiscount);
        btn_progdiscount.setOnClickListener(this);

        btn_altdiscount = (Button)findViewById(R.id.altdiscount);
        btn_altdiscount.setOnClickListener(this);
    }


    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.punchcard:
//                btn_panchcard.setTextColor(Color.rgb(0,255,0));
//                btn_progdiscount.setTextColor(Color.rgb(255,255,255));
//                btn_altdiscount.setTextColor(Color.rgb(255,255,255));
                startActivity(new Intent(getApplicationContext(), PunchCard.class));
//                callPunchCard();
                break;
            case R.id.progdiscount:
//                btn_panchcard.setTextColor(Color.rgb(255,255,255));
//                btn_progdiscount.setTextColor(Color.rgb(0,255,0));
//                btn_altdiscount.setTextColor(Color.rgb(255,255,255));
                startActivity(new Intent(getApplicationContext(), ProgressiveDiscount.class));
                break;
            case R.id.altdiscount:
//                btn_panchcard.setTextColor(Color.rgb(255,255,255));
//                btn_progdiscount.setTextColor(Color.rgb(255,255,255));
//                btn_altdiscount.setTextColor(Color.rgb(0,255,0));
                startActivity(new Intent(getApplicationContext(), AlternativeDiscount.class));
                break;
        }
    }

    private void callPunchCard(){
        startActivity(new Intent("com.riiwards.def.riiwardsloyalty.PunchCard"));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sign_in, menu);
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
