package com.linux.designpatterns.decorator;

import static org.hamcrest.CoreMatchers.containsString;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Guruprasad Kulkarni <guru@linux.com>
 */
public class DifferentFiltersTest {

    
     @Test
     public void SimpleWaterFilter() {
         //Arrange
         WaterFilter filter = new WaterFilter();
         
         //Act
         final String actual = filter.filter();
         
         //Assert
         assertThat(actual, containsString(WaterFilter.class.getSimpleName()));
         System.out.println("SimpleWaterFilter() :: " + actual);
     }
}
