package org.esiea.fofana.my_application;

import android.app.Application;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv_hw = (TextView)findViewById(R.id.tv_hello_world);
        DatePickerDialog dpd = null;






        getString(R.string.textfr);
        String now = DateUtils.formatDateTime(getApplicationContext(),new Date().getTime(), DateFormat.FULL);
        tv_hw.setText(now);



        Button btn_hw = (Button) findViewById(R.id.btn_start);
        btn_hw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),getString(R.string.toastfr),Toast.LENGTH_LONG).show();
                Intent i = new Intent(MainActivity.this,Second_activity.class);
                startActivity(i);



            }


        });

    Button btn_qt = (Button) findViewById(R.id.btn_quit);
    btn_qt.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent homeIntent = new Intent(Intent.ACTION_MAIN);
            homeIntent.addCategory( Intent.CATEGORY_HOME );
            homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(homeIntent);

        }
    });
    }
}
