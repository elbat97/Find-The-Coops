package com.example.elbat.sideproject;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by Elbat on 2017-12-27.
 */

public class Game4 extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamepage4);
        Button m = (Button) findViewById(R.id.button10);
        m.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Game4.this,MainActivity.class));
            }
        });
        Button k = (Button) findViewById(R.id.button9);
        k.setVisibility(View.VISIBLE);
        k.setBackgroundColor(Color.TRANSPARENT);
        k.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Game4.this,Game_end.class));
            }
        });
    }
}
