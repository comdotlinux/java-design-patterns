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
         Filter filter = new RoFilter(new PercolatingWaterFilter(new WaterFilter()));
         
         //Act
         final String actual = filter.filter();
         
         //Assert
         System.out.println("WaterFilterWithDecoratorPercolationFilterAndRo() :: \n" + actual);
         assertThat(actual, containsString(WaterFilter.class.getSimpleName()));
         assertThat(actual, containsString(PercolatingWaterFilter.class.getSimpleName()));
         assertThat(actual, containsString(RoFilter.class.getSimpleName()));
     }
     
     @Test
     public void WaterFilterWithDecoratorPercolationFilterRoAndUv() {
         //Arrange
         Filter filter = new UvFilter(new RoFilter(new PercolatingWaterFilter(new WaterFilter())));
         
         //Act
         final String actual = filter.filter();
         
         //Assert
         System.out.println("WaterFilterWithDecoratorPercolationFilterRoAndUv() :: \n" + actual);
         assertThat(actual, containsString(WaterFilter.class.getSimpleName()));
         assertThat(actual, containsString(PercolatingWaterFilter.class.getSimpleName()));
         assertThat(actual, containsString(RoFilter.class.getSimpleName()));
         assertThat(actual, containsString(UvFilter.class.getSimpleName()));
     }
     
     @Test
     public void WaterFilterWithDecoratorPercolationFilterRoUvAndPolisher() {
         //Arrange
         Filter filter = new WaterPolisher(new UvFilter(new RoFilter(new PercolatingWaterFilter(new WaterFilter()))));
         
         //Act
         final String actual = filter.filter();
         
         //Assert
         System.out.println("WaterFilterWithDecoratorPercolationFilterRoAndUv() :: \n" + actual);
         assertThat(actual, containsString(WaterFilter.class.getSimpleName()));
         assertThat(actual, containsString(PercolatingWaterFilter.class.getSimpleName()));
         assertThat(actual, containsString(RoFilter.class.getSimpleName()));
         assertThat(actual, containsString(UvFilter.class.getSimpleName()));
         assertThat(actual, containsString(WaterPolisher.class.getSimpleName()));
     }
     
     @Test
     public void WaterFilterWithDecoratorPercolationFilterRoUvPolisherAndDeodourizer() {
         //Arrange
         Filter filter = new WaterDeOdourizer(new WaterPolisher(new UvFilter(new RoFilter(new PercolatingWaterFilter(new WaterFilter())))));
         
         //Act
         final String actual = filter.filter();
         
         //Assert
         System.out.println("WaterFilterWithDecoratorPercolationFilterRoAndUv() :: \n" + actual);
         assertThat(actual, containsString(WaterFilter.class.getSimpleName()));
         assertThat(actual, containsString(PercolatingWaterFilter.class.getSimpleName()));
         assertThat(actual, containsString(RoFilter.class.getSimpleName()));
         assertThat(actual, containsString(UvFilter.class.getSimpleName()));
         assertThat(actual, containsString(WaterPolisher.class.getSimpleName()));
         assertThat(actual, containsString(WaterDeOdourizer.class.getSimpleName()));
     }
     
     @Test
     public void WaterFilterWithDecoratorUvPolisherAndDeodourizer() {
         //Arrange
         Filter filter = new WaterDeOdourizer(new WaterPolisher(new UvFilter(new WaterFilter())));
         
         //Act
         final String actual = filter.filter();
         
         //Assert
         System.out.println("WaterFilterWithDecoratorPercolationFilterRoAndUv() :: \n" + actual);
         assertThat(actual, containsString(WaterFilter.class.getSimpleName()));
         assertThat(actual, containsString(UvFilter.class.getSimpleName()));
         assertThat(actual, containsString(WaterPolisher.class.getSimpleName()));
         assertThat(actual, containsString(WaterDeOdourizer.class.getSimpleName()));
     }
     
     @Test
     public void WaterFilterWithDecoratorAndDeodourizer() {
         //Arrange
         Filter filter = new WaterDeOdourizer(new WaterFilter());
         
         //Act
         final String actual = filter.filter();
         
         //Assert
         System.out.println("WaterFilterWithDecoratorPercolationFilterRoAndUv() :: \n" + actual);
         assertThat(actual, containsString(WaterFilter.class.getSimpleName()));
         assertThat(actual, containsString(WaterDeOdourizer.class.getSimpleName()));
     }
     
     @Test
     public void UvFilterWithPolisher() {
         //Arrange
         Filter filter = new WaterPolisher(new UvFilter(new WaterFilter()));
         
         //Act
         final String actual = filter.filter();
         
         //Assert
         System.out.println("UvFilterWithPolisher() :: \n" + actual);
         assertThat(actual, containsString(WaterFilter.class.getSimpleName()));
         assertThat(actual, containsString(WaterPolisher.class.getSimpleName()));
         assertThat(actual, containsString(UvFilter.class.getSimpleName()));
     }
     
     
     
     
}
