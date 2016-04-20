package com.linux.designpatterns.flyweight.improved;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

/**
 *
 * @author Guruprasad Kulkarni <guru@linux.com>
 */
public class FlyWeightPatternTest {

    private WordProcessor ut;

    
    @Before
    public void setUp() {
        this.ut = new WordProcessor();
    }
    
    @After
    public void tearDown() {
        this.ut = null;
    }

     @Test
     public void checkWithNormalInput() {
         //Arrange
         String expected = "This is a very normal String. It has nothing special in it!";
         for (char c : expected.toCharArray()) {
             this.ut.add(c);
         }
         
        //Act
        String actual = ut.showText();
         
         //Assert         
         assertThat(actual, is(equalTo(expected)));
     }

     @Test
     public void checkWithExtraDuplicatesInput() {
         //Arrange
         String expected = "Thissssssssss isssssssss aaaaaaa veeerrrryyyyy aaaaabnooorrrmmmaaalll Strrrrrring. It hasssssss nothhhhhhhing sssssspeciallllll innnnnnnnn ittttttttt!";
         for (char c : expected.toCharArray()) {
             this.ut.add(c);
         }
         
        //Act
        String actual = ut.showText();
         
         //Assert         
         assertThat(actual, is(equalTo(expected)));
     }
     
     
}
