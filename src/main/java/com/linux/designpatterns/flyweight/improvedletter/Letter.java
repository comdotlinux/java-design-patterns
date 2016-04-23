/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linux.designpatterns.flyweight.improvedletter;

import java.util.ArrayList;
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
    
    private static final Map<String, Letter> letters = new HashMap<String, Letter>();
    
    private final char letter;

    public Letter(char letter) {
        LOG.info("Creating Letter ->{}<-", letter);
        this.letter = letter;
    }

    public char getLetter() {
        return letter;
    }
    
}
