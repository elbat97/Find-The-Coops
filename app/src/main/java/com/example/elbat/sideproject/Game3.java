package com.example.elbat.sideproject;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by Elbat on 2017-12-26.
 */

public class Game3 extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gampage3);
        Button o = (Button) findViewById(R.id.button7);
        o.setVisibility(View.VISIBLE);
        o.setBackgroundColor(Color.TRANSPARENT);
        o.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Game3.this,Game4.class));
            }
        });
        Button m = (Button) findViewById(R.id.button8);
        m.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Game3.this,MainActivity.class));
            }
        });
    }
}
