package com.example.user.wordcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCountActivity extends AppCompatActivity {

    String sentence;

    EditText sentenceInputText;
    TextView answerText;
    Button countButton;
    WordCount wordCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);

        sentenceInputText = (EditText) findViewById(R.id.sentence_input);
        answerText = (TextView) findViewById(R.id.answer_text);
        countButton = (Button) findViewById(R.id.count_button);

        wordCount = new WordCount(sentence);
    }

    public void setCountButtonClicked(View button) {
        int countOfWords = wordCount.countWords(sentence);
        answerText.setText(countOfWords);
    }


}
