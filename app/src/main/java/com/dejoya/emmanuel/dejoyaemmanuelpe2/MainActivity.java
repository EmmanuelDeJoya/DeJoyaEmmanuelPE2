package com.dejoya.emmanuel.dejoyaemmanuelpe2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    SharedPreferences sharedpreferences;
    EditText name;
    EditText age;
    EditText gender;
    public static final String mypreference = "mypref";
    public static final String Name = "nameKey";
    public static final String Age = "ageKey";
    public static final String Gender = "genderKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.etName);
        age = (EditText) findViewById(R.id.etAge);
        gender = (EditText) findViewById(R.id.etGen);
        sharedpreferences = getSharedPreferences(mypreference,
                Context.MODE_PRIVATE);
        if (sharedpreferences.contains(Name)) {
            name.setText(sharedpreferences.getString(Name, ""));
        }
        if (sharedpreferences.contains(Age)) {
            age.setText(sharedpreferences.getString(Age, ""));

        }
        if (sharedpreferences.contains(Gender)) {
            gender.setText(sharedpreferences.getString(Gender, ""));

        }

    }

    public void Save(View view) {
        String n = name.getText().toString();
        String a = age.getText().toString();
        String g = gender.getText().toString();
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putString(Name, n);
        editor.putString(Age, a);
        editor.putString(Gender, g);
        editor.commit();
    }


    public void Search (View view) {
        name = (EditText) findViewById(R.id.etName);
        age = (EditText) findViewById(R.id.etAge);
        gender = (EditText) findViewById(R.id.etGen);
        sharedpreferences = getSharedPreferences(mypreference,
                Context.MODE_PRIVATE);

        if (sharedpreferences.contains(Name)) {
            name.setText(sharedpreferences.getString(Name, ""));
        }
        if (sharedpreferences.contains(Age)) {
            age.setText(sharedpreferences.getString(Age, ""));

        }
        if (sharedpreferences.contains(Gender)) {
            gender.setText(sharedpreferences.getString(Gender, ""));

        }
    }


}
