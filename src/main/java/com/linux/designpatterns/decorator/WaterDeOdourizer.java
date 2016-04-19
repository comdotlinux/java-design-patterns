package com.linux.designpatterns.decorator;

/**
 *
 * @author Guruprasad Kulkarni <guru@linux.com>
 */
public class WaterDeOdourizer extends WaterFilterDecorator{
    
    public WaterDeOdourizer(Filter filter) {
        super(filter);
    }

    @Override
    public String filter() {
        return super.filter() + this.getClass().getSimpleName() + " : De-Odourising water using Propritery Technology...\n";
    }
    
    
}
