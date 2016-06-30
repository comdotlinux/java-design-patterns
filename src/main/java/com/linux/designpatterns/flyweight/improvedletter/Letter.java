/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linux.designpatterns.flyweight.improvedletter;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Guruprasad Kulkarni <guru@linux.com>
 */
public class Letter {

    private static final Logger LOG = LoggerFactory.getLogger(Letter.class);

    private static final Map<Character, Letter> LETTERS = new HashMap<Character, Letter>();

    private final char letter;

    private Letter(char letter) {
        this.letter = letter;
    }

    /**
     * Creating instance of Letter or returning from cache if it is available.
     *
     * @param letter letter for which character instance need to be created.
     * @return {@linkplain Letter} instance.
     */
    public static final Letter getLetter(char letter) {
        Letter l = LETTERS.get(letter);
        LOG.info("letter available in cache? {}", l == null);
        if (l == null) {
            LOG.info("Creating Letter ->{}<-", letter);
            LETTERS.put(letter, new Letter(letter));
            l = LETTERS.get(letter);
        }
        return l;
    }

    public char getLetter() {
        return letter;
    }

    @Override
    public String toString() {
        return "Letter{" + "letter=" + letter + '}';
    }
}
