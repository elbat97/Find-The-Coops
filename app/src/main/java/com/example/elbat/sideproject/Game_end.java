package com.example.elbat.sideproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by Elbat on 2017-12-27.
 */

public class Game_end extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.end_game);
        Button k = (Button) findViewById(R.id.button12);
        k.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Game_end.this,MainActivity.class));
            }
        });

    }
}
