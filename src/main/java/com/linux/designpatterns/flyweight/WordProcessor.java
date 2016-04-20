package com.linux.designpatterns.flyweight;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Guruprasad Kulkarni <guru@linux.com>
 */
public class WordProcessor {
    
    private static final Logger LOG = LoggerFactory.getLogger(WordProcessor.class);
    
    private final List<Letter> letters;

    public WordProcessor() {
        this.letters = new ArrayList<>();
    }
    
    public WordProcessor add(Letter letter){
        letters.add(letter);
        return this;
    }

    public WordProcessor add(char c) {
        LOG.info("Added character ->{}<- to Word Processor", c);
        letters.add(new Letter(c));
        return this;
    }
    
    public String showText() {
        StringBuilder textBuilder = new StringBuilder();
        for (Letter letter : letters) {
            textBuilder.append(letter.getLetter());
        }
        
        final String currentText = textBuilder.toString();
        LOG.info("text : {}", currentText);
        LOG.info("Number of letters available : {}", letters.size());
        return currentText;
    }
    
}
