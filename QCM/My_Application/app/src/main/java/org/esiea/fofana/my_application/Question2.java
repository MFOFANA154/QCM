package org.esiea.fofana.my_application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Question2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);

        Button btn_r1 = (RadioButton) findViewById(R.id.radioButton);
        Button btn_r2 = (RadioButton) findViewById(R.id.radioButton2);
        Button btn_r3 = (RadioButton) findViewById(R.id.radioButton3);
        btn_r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Question2.this, Final_activity.class);
                startActivity(i);
            }
        });


        btn_r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Question2.this, Bad_answer.class);
                startActivity(i);
            }
        });

        btn_r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Question2.this, Bad_answer.class);
                startActivity(i);
            }
        });

        Button btn_qt4 = (Button) findViewById(R.id.btn_quit4);
        btn_qt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i2 = new Intent(Question2.this, MainActivity.class);
                startActivity(i2);
            }
        });
    }
}
