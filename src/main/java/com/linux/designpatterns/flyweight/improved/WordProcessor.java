package com.linux.designpatterns.flyweight.improved;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Here the Word Processor is Improved using a Word Cache
 *
 * @author Guruprasad Kulkarni <guru@linux.com>
 */
public class WordProcessor {

    private static final Logger LOG = LoggerFactory.getLogger(WordProcessor.class);

    private final Map<Character, Letter> letterCache;

    private final List<Letter> letters;

    public WordProcessor() {
        this.letterCache = new LinkedHashMap<>();
        letters = new ArrayList<>();
    }

    public WordProcessor add(char c) {
        Letter l = letterCache.get(c);
        final boolean letterAvailable = null != l;
        if (!letterAvailable) {
            l = new Letter(c);
            letterCache.put(c, l);
        } 
        LOG.info("Added character ->{}<- to Word Processor? {}",c, letterAvailable);
        letters.add(l);
        return this;
    }

    public String showText() {
        StringBuilder textBuilder = new StringBuilder();
        for (Letter letter : letters) {
            textBuilder.append(letter.getLetter());
        }

        final String currentText = textBuilder.toString();
        LOG.info("text : {}", currentText);
        LOG.info("Number of letters available : {}", letterCache.size());
        return currentText;
    }

}
