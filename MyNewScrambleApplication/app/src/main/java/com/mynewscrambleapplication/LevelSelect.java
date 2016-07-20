package com.mynewscrambleapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class LevelSelect extends AppCompatActivity {
Intent intent,lvl1,lvl2,lvl3;
    TextView tv;
    String name;
    RadioButton rb1,rb2,rb3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_select);
        tv = (TextView)findViewById(R.id.textView);
        intent  = getIntent();
        name = intent.getStringExtra("name");
        tv.setText("welcome  "+name);
        rb1 = (RadioButton)findViewById(R.id.radioButton);
        rb2 = (RadioButton)findViewById(R.id.radioButton2);
        rb3 = (RadioButton)findViewById(R.id.radioButton3);


    }


    public void Beginner(View v)
    {
       // Toast.makeText(LevelSelect.this,radio1.getText().toString()+" level", Toast.LENGTH_SHORT).show();
        lvl1=new Intent("beginner");
        lvl1.putExtra("name",name);
        lvl1.putExtra("level","Beginner");
        startActivity(lvl1);
    }


    public void Intermediate(View v)
    {
        lvl2 = new Intent("intermediate");
        lvl2.putExtra("name",name);
        lvl2.putExtra("level","Intermediate");
        startActivity(lvl2);
    }
    public void Expert(View v)
    {
        lvl3 = new Intent("expert");
        lvl3.putExtra("name",name);
        lvl3.putExtra("level","Expert");
        startActivity(lvl3);
    }


}
