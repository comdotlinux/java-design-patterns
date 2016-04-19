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
         System.out.println("SimpleWaterFilter() :: \n" + actual);
     }
     
     
     @Test
     public void SimpleWaterFilterWithDecorator() {
         //Arrange
         Filter filter = new WaterFilter();
         
         //Act
         final String actual = filter.filter();
         
         //Assert
         assertThat(actual, containsString(WaterFilter.class.getSimpleName()));
         System.out.println("SimpleWaterFilterWithDecorator() :: \n" + actual);
     }
     
     @Test
     public void WaterFilterWithDecoratorAndPercolationFilter() {
         //Arrange
         Filter filter = new PercolatingWaterFilter(new WaterFilter());
         
         //Act
         final String actual = filter.filter();
         
         //Assert
         assertThat(actual, containsString(WaterFilter.class.getSimpleName()));
         assertThat(actual, containsString(PercolatingWaterFilter.class.getSimpleName()));
         System.out.println("WaterFilterWithDecoratorAndPercolationFilter() :: \n" + actual);
     }
     
     @Test
     public void WaterFilterWithDecoratorPercolationFilterAndRo() {
         //Arrange
         WaterFilterDecorator filter = new RoFilter(new PercolatingWaterFilter(new WaterFilter()));
         
         //Act
         final String actual = filter.filter();
         
         //Assert
         System.out.println("WaterFilterWithDecoratorPercolationFilterAndRo() :: \n" + actual);
         assertThat(actual, containsString(WaterFilter.class.getSimpleName()));
         assertThat(actual, containsString(PercolatingWaterFilter.class.getSimpleName()));
         assertThat(actual, containsString(RoFilter.class.getSimpleName()));
     }
     
     
}
