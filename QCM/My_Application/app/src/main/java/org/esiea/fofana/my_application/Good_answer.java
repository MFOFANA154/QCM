package org.esiea.fofana.my_application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Good_answer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_good_answer);


        Button btn_qt2 = (Button) findViewById(R.id.btn_quit2);
        btn_qt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(Good_answer.this, MainActivity.class);
                startActivity(i3);
            }
        });
        Button btn_nxt = (Button) findViewById(R.id.btn_next);
        btn_nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i5 = new Intent(Good_answer.this, Question2.class);
                startActivity(i5);
            }
        });
    }
}

