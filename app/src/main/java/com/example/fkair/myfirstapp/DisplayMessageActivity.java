package com.example.fkair.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        /* Get the Intent that started this activity and
           extract the string. */
        Intent intent = getIntent();
        String msg = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        /* Capture the layout's TextView and set the message as its text. */
        TextView tv = findViewById(R.id.textView);
        tv.setText(msg);
    }
}
