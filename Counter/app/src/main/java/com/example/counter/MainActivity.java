package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increaseTextView(View view) {
        counter++;
        setTextViewValue(counter);
    }

    public void decreaseTextView(View view) {
        counter--;
        setTextViewValue(counter);
    }

    public void clearTextView(View view) {
        counter = 0;
        setTextViewValue(counter);
    }

    private void setTextViewValue(int counter) {
        TextView textView = (TextView) findViewById(R.id.counter_view);
        textView.setText(counter);
    }
}
