package com.example.android.cookies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    String BEFORE_EAT_COOKIE = "Eat Cookie";
    String AFTER_EAT_COOKIE = "Fill Cookie";
    String BEFORE_EAT_TEXT = "I'm so hungry.";
    String AFTER_EAT_TEXT = "I'm so full.";

    public void onClickButton(View view){
        ImageView cookieImageView = (ImageView) findViewById(R.id.imageView);
        TextView cookieTextView = (TextView) findViewById(R.id.textView);
        Button cookieButton = (Button) findViewById(R.id.button);

        //String buttonText = (String) cookieButton.getText();
        String buttonText = (String) cookieButton.getText().toString();
        Log.i("MainActivity",buttonText);

        if (buttonText.equals(BEFORE_EAT_COOKIE)) {
            cookieImageView.setImageResource(R.drawable.after_cookie);
            cookieButton.setText(AFTER_EAT_COOKIE);
            cookieTextView.setText(AFTER_EAT_TEXT);
        }else if (buttonText.equals(AFTER_EAT_COOKIE)) {
            cookieImageView.setImageResource(R.drawable.before_cookie);
            cookieButton.setText(BEFORE_EAT_COOKIE);
            cookieTextView.setText(BEFORE_EAT_TEXT);
        }
    }
}
