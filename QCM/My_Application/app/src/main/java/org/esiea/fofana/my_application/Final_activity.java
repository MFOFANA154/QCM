package org.esiea.fofana.my_application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Final_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_activity);

        Button btn_qt4 = (Button) findViewById(R.id.btn_quit4);
        btn_qt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i2 = new Intent(Final_activity.this, MainActivity.class);
                startActivity(i2);
            }
        });
    }
}
