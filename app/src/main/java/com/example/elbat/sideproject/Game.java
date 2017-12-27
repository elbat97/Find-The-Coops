package com.example.elbat.sideproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by Elbat on 2017-12-25.
 */

public class Game extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.gamepage1);
        Button b = (Button) findViewById(R.id.button5);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Game.this,Game2.class));
            }
        });
    }
}
