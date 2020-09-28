package com.example.ahmad2.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    TimePicker timePicker;
    String string="";
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findView();

        int hour=timePicker.getCurrentHour();
        int minute=timePicker.getCurrentMinute();
        string =hour+":"+minute;
        textView.setText(string);

        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                String string;
                string=hourOfDay+":"+minute;
                textView.setText(string);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,DatePickerActivity.class);
                startActivity(intent);
            }
        });


    }

    void findView(){
        button=(Button)findViewById(R.id.btnNext);
        timePicker=(TimePicker)findViewById(R.id.timePik);
        textView=(TextView)findViewById(R.id.txtViewDate);
    }
}
