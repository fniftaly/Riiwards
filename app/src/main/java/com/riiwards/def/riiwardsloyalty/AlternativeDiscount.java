package com.riiwards.def.riiwardsloyalty;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class AlternativeDiscount extends Activity implements View.OnClickListener{

    Button btn_alt, btn_prog, btn_punch;
    TextView prdisc1,prdisc2,prdisc3,prdisc4,prdisc5;
    RadioButton rbtlow, rbtmed, rbthigh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alternative_discount);


        btn_alt = (Button)findViewById(R.id.altdiscount);
//
        btn_alt.setOnClickListener(this);
//
        btn_prog = (Button)findViewById(R.id.progdiscount);
//
        btn_prog.setOnClickListener(this);
//
        btn_punch = (Button)findViewById(R.id.punchcard);
//
        btn_punch.setOnClickListener(this);
//
        rbtlow = (RadioButton)findViewById(R.id.rbtlow);
//
        rbtlow.setOnClickListener(this);
//
        rbtmed = (RadioButton)findViewById(R.id.rbtmed);
//
        rbtmed.setOnClickListener(this);
//
        rbthigh = (RadioButton)findViewById(R.id.rbthigh);
//
        rbthigh.setOnClickListener(this);
//
        prdisc1 = (TextView)findViewById(R.id.prdisc1);
        prdisc2 = (TextView)findViewById(R.id.prdisc2);
        prdisc3 = (TextView)findViewById(R.id.prdisc3);
        prdisc4 = (TextView)findViewById(R.id.prdisc4);
        prdisc5 = (TextView)findViewById(R.id.prdisc5);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.progdiscount:
                startActivity(new Intent("com.riiwards.def.riiwardsloyalty.ProgressiveDiscount"));
                break;
            case R.id.punchcard:
                btn_alt.setTextColor(Color.rgb(255, 255, 255));
                btn_punch.setTextColor(Color.rgb(255, 255, 255));
                btn_prog.setTextColor(Color.rgb(255, 255, 255));
                startActivity(new Intent("com.riiwards.def.riiwardsloyalty.Punchcard"));
                break;
            case R.id.rbtlow:
                prdisc2.setText("7%");
                prdisc3.setText("9%");
                prdisc4.setText("12%");
                prdisc5.setText("15%");
                break;
            case R.id.rbtmed:
                prdisc2.setText("10%");
                prdisc3.setText("12%");
                prdisc4.setText("15%");
                prdisc5.setText("20%");
                break;
            case R.id.rbthigh:
                prdisc2.setText("10%");
                prdisc3.setText("15%");
                prdisc4.setText("20%");
                prdisc5.setText("25%");
                break;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_alternative_discount, menu);
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
