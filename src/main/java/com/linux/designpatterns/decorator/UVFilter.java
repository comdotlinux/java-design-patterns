package com.linux.designpatterns.decorator;

/**
 *
 * @author Guruprasad Kulkarni <guru@linux.com>
 */
public class UVFilter extends WaterFilterDecorator{
    
    public UVFilter(WaterFilter waterFilter) {
        super(waterFilter);
    }

    @Override
    public String filter() {
        return "UVFilter: passing water under high intensity Ultra Violet Lamp...\n" + super.filter();
    }
    
    
}
