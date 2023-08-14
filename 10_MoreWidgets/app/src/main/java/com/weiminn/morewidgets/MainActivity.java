package com.weiminn.morewidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.Toast;

import java.sql.Array;
import java.sql.Time;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBox;
    RadioGroup radioGroup;
    Spinner spinner;
    TimePicker timePicker;

    DatePicker datePicker;

    Button getDatetime;

    ProgressBar progressBar;

    int progress = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox = findViewById(R.id.checkBox);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(
                            MainActivity.this,
                            "Checkbox is checked",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(
                            MainActivity.this,
                            "Checkbox is unchecked",
                            Toast.LENGTH_SHORT).show();

                }
            }
        });

        radioGroup = findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                RadioButton radioButton = findViewById(checkedId);
                Toast.makeText(
                        MainActivity.this,
                        radioButton.getText().toString() + " is selected",
                        Toast.LENGTH_SHORT).show();
            }
        });

        spinner = findViewById(R.id.spinner);
        String[] courses = {"C++", "Java", "Python"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                courses
        );

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String item = spinner.getSelectedItem().toString();
                Toast.makeText(
                        MainActivity.this,
                        item + " is selected",
                        Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        timePicker = findViewById(R.id.timePicker);
        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int hour, int minute) {
                Toast.makeText(
                        MainActivity.this,
                        "It's" + hour + " hour and " + minute + " minutes!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        datePicker = findViewById(R.id.datePicker);
        datePicker.setOnDateChangedListener(new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker datePicker, int i, int i1, int i2) {
                Toast.makeText(
                        MainActivity.this,
                        "It's" + i + ", " + i1 + ", " + i2 + "!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        getDatetime = findViewById(R.id.getDateTime);
        progressBar = findViewById(R.id.progressBar);
        getDatetime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int minute = timePicker.getMinute();
                int hour = timePicker.getHour();
                int day = datePicker.getDayOfMonth();
                int month = datePicker.getMonth();
                int year = datePicker.getYear();
                Toast.makeText(
                        MainActivity.this,
                        minute + ":" + hour + ":" + day + ":" + day + ":" + month + ":" + year,
                        Toast.LENGTH_SHORT).show();

                progress += 10;
                progressBar.setProgress(progress);

            }
        });

    }
}