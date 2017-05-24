package com.codeclan.example.wordcounterhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inputEditText;
    private Button countButton;
    private TextView outputTextView;
    private WordCounter wordCounter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputEditText = (EditText)findViewById(R.id.input_text);
        countButton = (Button)findViewById(R.id.button_text);
        outputTextView = (TextView)findViewById(R.id.output_text);
    }

    public void onCountButtonPress(View Button) {
        Log.d(getClass().toString(), "count button was pressed");

        String input = inputEditText.getText().toString();
        Log.d(getClass().toString(), "The input was: " + input);

        wordCounter = new WordCounter(input);
        int output = wordCounter.countWords();
        outputTextView.setText(Integer.toString(output));

    }


}
