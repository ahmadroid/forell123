package com.example.ahmad2.myapplication;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.widget.DatePicker;
import android.widget.TextView;

public class DatePickerActivity extends Activity {

    DatePicker datePicker;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datepicker);

        findView();

        int year=datePicker.getYear();
        int mounth=datePicker.getMonth()+1;
        int day=datePicker.getDayOfMonth();

        String string=year+"/"+mounth+"/"+day;
        textView.setText(string);

        datePicker.setOnDateChangedListener(new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                String string=year+"/"+monthOfYear+"/"+dayOfMonth;
                textView.setText(string);
            }
        });

    }

    void findView(){
        datePicker=(DatePicker)findViewById(R.id.datePicker);
        textView=(TextView)findViewById(R.id.txtViewDate);
    }
}
