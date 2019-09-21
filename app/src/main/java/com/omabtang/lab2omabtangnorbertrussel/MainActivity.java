package com.omabtang.lab2omabtangnorbertrussel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1, e2, e3, e4,e5 ,e6 ,e7 , e8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public static final String prefName = "MyData";
    public void onSave(View V){
        e1 = findViewById(R.id.editText);
        e2 = findViewById(R.id.editText2);
        e3 = findViewById(R.id.editText3);
        e4 = findViewById(R.id.editText4);
        e5 = findViewById(R.id.editText5);
        e6 = findViewById(R.id.editText6);
        e7 = findViewById(R.id.editText7);
        e8 = findViewById(R.id.editText8);


        String course1 = e1.getText().toString();
        String course2 =  e2.getText().toString();
        String course3 = e3.getText().toString();
        String course4=  e4.getText().toString();
        String course5 = e5.getText().toString();
        String course6 =  e6.getText().toString();
        String course7 = e7.getText().toString();
        String course8 =  e8.getText().toString();

        SharedPreferences.Editor editor = getSharedPreferences(prefName, MODE_PRIVATE).edit();
        editor.putString(course1, course1);
        editor.putString(course2, course2);
        editor.putString(course3, course3);
        editor.putString(course4, course4);
        editor.putString(course5, course5);
        editor.putString(course6, course6);
        editor.putString(course7, course7);
        editor.putString(course8, course8);

        editor.apply();
        Toast.makeText(this, "Course Saved", Toast.LENGTH_LONG).show();
    }
    public void onNext(View V){
        Intent intent1 = new Intent(this, SecondActivity.class);
        startActivity(intent1);
    }
}

