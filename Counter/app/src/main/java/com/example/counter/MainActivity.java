package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
        String counterValue = String.valueOf(counter);
        textView.setText(counterValue);
    }

    public void openSetValueLayout(View view) {
        Intent intent = new Intent(this,  SetCounterActivity.class);
        startActivityForResult(intent, 2);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 2) {
            if (resultCode == RESULT_OK) {
                String returnString = data.getStringExtra("newCounterValue");
                TextView textView = (TextView) findViewById(R.id.counter_view);
                textView.setText(returnString);
            }
        }
    }
}
