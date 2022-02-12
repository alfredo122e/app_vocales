package com.example.vocales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity5 extends AppCompatActivity {

    ImageButton imagen5;
    Button pagina4;
    Button pagina;
    private MediaPlayer mediaplayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        imagen5= (ImageButton) findViewById(R.id.imageButton7);
        mediaplayer= MediaPlayer.create(this,R.raw.audio5);
        pagina4 = (Button) findViewById(R.id.button14);
        pagina = (Button) findViewById(R.id.button15);

        imagen5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaplayer.start();
            }
        });

        pagina4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaplayer.stop();
                Intent pagina4 = new Intent(MainActivity5.this, MainActivity4.class);
                startActivity(pagina4);
            }
        });

        pagina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaplayer.stop();
                Intent pagina = new Intent(MainActivity5.this, MainActivity.class);
                startActivity(pagina);
            }
        });
    }
}