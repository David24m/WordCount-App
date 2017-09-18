package com.example.user.wordcount;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 18/09/2017.
 */
public class WordCountTest {

    WordCount wordCount;

    @Before
    public void before() {
        wordCount = new WordCount("How many words do I need?");
    }


    @Test
    public void firstCountOfSentence() throws Exception {
        assertEquals(6, wordCount.countWords("How many words do I need?"));
    }

    @Test
    public void secondCountOfSentence() throws Exception {
        assertEquals(8, wordCount.countWords("This must be enough words this time surely?"));
    }

}