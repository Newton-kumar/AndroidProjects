package com.mynewscrambleapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Intent i1,i2;
EditText et;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         b  = (Button)findViewById(R.id.button);
        et = (EditText)findViewById(R.id.editText);

        i1 = new Intent(this,MusicService.class);
        startService(i1);
    }


    public void goToLevel(View v)
    {

        if(et.getText().toString().trim().equals(""))
        {
            Toast.makeText(this,"please enter your name",Toast.LENGTH_SHORT).show();
        }

        else
        {i2 = new Intent("jumpToLevelSelect");
            i2.putExtra("name",et.getText().toString().trim());
            startActivity(i2);
        }
    }

}
