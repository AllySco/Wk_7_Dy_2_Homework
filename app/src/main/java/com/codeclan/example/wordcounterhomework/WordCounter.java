package com.codeclan.example.wordcounterhomework;

/**
 * Created by user on 23/05/2017.
 */

public class WordCounter {

    private String input;
    private String[] inputArray;

    public WordCounter(String input) {
        this.input = input;
    }


    public String getInput() {
        return this.input;
    }


    public int countWords() {
        inputArray = this.input.split(" ");
        int words = inputArray.length;
        return words;
    }

}
