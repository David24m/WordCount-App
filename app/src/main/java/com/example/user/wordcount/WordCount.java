package com.example.user.wordcount;

/**
 * Created by user on 18/09/2017.
 */

public class WordCount {

    String sentence;

    public WordCount(String sentence) {
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }

    public int countWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }
        String[] words = sentence.split("\\s+");
        return words.length;
    }

}
