package com.example.vocales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity4 extends AppCompatActivity {

    ImageButton imagen4;
    Button pagina3;
    Button pagina5;
    private MediaPlayer mediaplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        imagen4= (ImageButton) findViewById(R.id.imageButton6);
        mediaplayer= MediaPlayer.create(this,R.raw.audio4);
        pagina3 = (Button) findViewById(R.id.button12);
        pagina5 = (Button) findViewById(R.id.button13);

        imagen4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaplayer.start();
            }
        });

        pagina3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaplayer.stop();
                Intent pagina3 = new Intent(MainActivity4.this, MainActivity3.class);
                startActivity(pagina3);
            }
        });

        pagina5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaplayer.stop();
                Intent pagina5 = new Intent(MainActivity4.this, MainActivity5.class);
                startActivity(pagina5);
            }
        });
    }
}