package com.example.vocales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity1 extends AppCompatActivity {

    ImageButton imagen1;
    Button pagina;
    Button pagina2;
    private MediaPlayer mediaplayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        imagen1= (ImageButton) findViewById(R.id.imageButton);
        mediaplayer=MediaPlayer.create(this,R.raw.audio1);
        pagina2 = (Button) findViewById(R.id.button3);
        pagina = (Button) findViewById(R.id.button5);

        imagen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaplayer.start();
            }
        });

        pagina2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaplayer.stop();
                Intent pagina2 = new Intent(MainActivity1.this, MainActivity2.class);
                startActivity(pagina2);
            }
        });

        pagina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaplayer.stop();
                Intent pagina = new Intent(MainActivity1.this, MainActivity.class);
                startActivity(pagina);
            }
        });
    }
}