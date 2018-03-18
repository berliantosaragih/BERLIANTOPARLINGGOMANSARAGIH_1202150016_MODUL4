package com.example.linggom.berlianto_1202150016_studycase4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

        private Button x, y;
        @Override

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            x = (Button) findViewById(R.id.pencari);
            y = (Button) findViewById(R.id.list);

            x.setOnClickListener(new View.OnClickListener() {

                @Override

                public void onClick(View v) {
                    Intent ab = new Intent(MainActivity.this,SearchImage.class);
                    startActivity(ab);
                }

            });

            y.setOnClickListener(new View.OnClickListener() {

                @Override

                public void onClick(View v) {
                    Intent ac = new Intent(MainActivity.this, ListNama.class);
                    startActivity(ac);
                }


            });
        }
    }