package com.example.counter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SetCounterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_counter);
    }

    public void setCounterValue(View view) {
        EditText editText = (EditText) findViewById(R.id.set_counter);
        String stringToPassBack = editText.getText().toString();
        Intent intent = new Intent();
        intent.putExtra("newCounterValue", stringToPassBack);
        setResult(RESULT_OK, intent);
        finish();
    }
}
