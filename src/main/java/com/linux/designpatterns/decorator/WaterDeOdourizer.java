package com.linux.designpatterns.decorator;

/**
 *
 * @author Guruprasad Kulkarni <guru@linux.com>
 */
public class WaterDeOdourizer extends WaterFilterDecorator{
    
    public WaterDeOdourizer(WaterFilter waterFilter) {
        super(waterFilter);
    }

    @Override
    public String filter() {
        return "WaterDeOdourizer : De-Odourising water using Propritery Technology...\n" + super.filter();
    }
    
    
}
