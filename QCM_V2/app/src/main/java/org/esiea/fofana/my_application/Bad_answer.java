package org.esiea.fofana.my_application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bad_answer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bad_answer);
        Button btn_qt3 = (Button) findViewById(R.id.btn_quit3);
        btn_qt3.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent i3 = new Intent(Bad_answer.this, MainActivity.class);
                startActivity(i3);
            }
        });
    }
}
