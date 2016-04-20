package com.linux.designpatterns.flyweight.improved;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Here the Word Processor is Improved using a Word Cache
 * @author Guruprasad Kulkarni <guru@linux.com>
 */
public class WordProcessor {
    
    private static final Logger LOG = LoggerFactory.getLogger(WordProcessor.class);
    
    private final Map<Character,Letter> letterCache;

    public WordProcessor() {
        this.letterCache = new HashMap<>();
    }
    
    public WordProcessor add(char c) {
        Letter l = letterCache.get(c);
        if(null == l) {
            letterCache.put(c, l);
            LOG.info("Added character ->{}<- to Word Processor", c);
        }
        return this;
    }
    
    public String showText() {
        StringBuilder textBuilder = new StringBuilder();
        for (Map.Entry<Character, Letter> entry  : letterCache.entrySet()) {
            textBuilder.append(entry.getValue().getLetter());
        }
        
        final String currentText = textBuilder.toString();
        LOG.info("text : {}", currentText);
        LOG.info("Number of letters available : {}", letterCache.size());
        return currentText;
    }
    
}
