/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.linux.designpatterns.flyweight.improvedletter;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 *
 * @author Guruprasad Kulkarni <guru@linux.com>
 */
public class WordProcessorTest {

    private WordProcessor wp;

    public WordProcessorTest() {
    }

    @Before
    public void setUp() {
        this.wp = new WordProcessor();
    }

    /**
     * Test of add method, of class WordProcessor.
     */
    @Test
    public void testAdd_Letter() {
        System.out.println("add");
         //Arrange
         String expected = "This is a very normal String. It has nothing special in it!";
         for (char c : expected.toCharArray()) {
             this.wp.add(c);
         }
         
        //Act
        String actual = wp.showText();
         
         //Assert         
         assertThat(actual, is(equalTo(expected)));
    }

//    /**
//     * Test of add method, of class WordProcessor.
//     */
//    @Test
//    public void testAdd_char() {
//        System.out.println("add");
//        char c = ' ';
//        WordProcessor instance = new WordProcessor();
//        WordProcessor expResult = null;
//        WordProcessor result = instance.add(c);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of showText method, of class WordProcessor.
//     */
//    @Test
//    public void testShowText() {
//        System.out.println("showText");
//        WordProcessor instance = new WordProcessor();
//        String expResult = "";
//        String result = instance.showText();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

}