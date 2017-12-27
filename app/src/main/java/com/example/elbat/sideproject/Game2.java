package com.example.elbat.sideproject;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Elbat on 2017-12-25.
 */

public class Game2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamepage2);

        Button o = (Button) findViewById(R.id.button6);
        o.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Game2.this,MainActivity.class));
            }
        });
        Button p = (Button) findViewById(R.id.firstpic);
        p.setVisibility(View.VISIBLE);
        p.setBackgroundColor(Color.TRANSPARENT);
        p.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Game2.this,Game3.class));
            }
        });



    }

}
