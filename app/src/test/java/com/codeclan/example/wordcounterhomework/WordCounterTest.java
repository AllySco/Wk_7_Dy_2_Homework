package com.codeclan.example.wordcounterhomework;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by user on 23/05/2017.
 */
public class WordCounterTest {

    @Test
    public void canGetInput() {
        WordCounter stringInput = new WordCounter("How much cheese");
        assertEquals("How much cheese", stringInput.getInput());
    }


    @Test
    public void canSplitInput() {
        WordCounter stringInput = new WordCounter("How much cheese");
        assertEquals(3, stringInput.countWords());
    }

}