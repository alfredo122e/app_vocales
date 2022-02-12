package com.example.vocales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity3 extends AppCompatActivity {

    ImageButton imagen3;
    Button pagina2;
    Button pagina4;
    private MediaPlayer mediaplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        imagen3= (ImageButton) findViewById(R.id.imageButton2);
        mediaplayer= MediaPlayer.create(this,R.raw.audio3);
        pagina2 = (Button) findViewById(R.id.button2);
        pagina4 = (Button) findViewById(R.id.button4);

        imagen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaplayer.start();
            }
        });

        pagina2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaplayer.stop();
                Intent pagina2 = new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(pagina2);
            }
        });

        pagina4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaplayer.stop();
                Intent pagina4 = new Intent(MainActivity3.this, MainActivity4.class);
                startActivity(pagina4);
            }
        });
    }
}