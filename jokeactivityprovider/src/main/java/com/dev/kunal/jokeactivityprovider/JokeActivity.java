package com.dev.kunal.jokeactivityprovider;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String JOKE_KEY = "joke_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        Intent intent = getIntent();
        if(intent != null) {
            String joke = intent.getStringExtra(JOKE_KEY);
            if(joke != null && joke.length() != 0 ){
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText(joke);
            }
        }

    }

}
