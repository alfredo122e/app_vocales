package com.example.vocales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {

        ImageButton imagen2;
        Button pagina3;
        Button pagina1;
        private MediaPlayer mediaplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imagen2= (ImageButton) findViewById(R.id.imageButton3);
        mediaplayer= MediaPlayer.create(this,R.raw.audio2);
        pagina3 = (Button) findViewById(R.id.button7);
        pagina1 = (Button) findViewById(R.id.button6);

        imagen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaplayer.start();
            }
        });

        pagina3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaplayer.stop();
                Intent pagina3 = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(pagina3);
            }
        });

        pagina1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaplayer.stop();
                Intent pagina1 = new Intent(MainActivity2.this, MainActivity1.class);
                startActivity(pagina1);
            }
        });
    }
}