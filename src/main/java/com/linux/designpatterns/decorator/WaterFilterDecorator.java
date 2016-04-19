package com.linux.designpatterns.decorator;

/**
 *
 * @author Guruprasad Kulkarni <guru@linux.com>
 */
public class WaterFilterDecorator extends WaterFilter{
    
    protected WaterFilter waterFilter;
    
    public WaterFilterDecorator(WaterFilter waterFilter) {
        this.waterFilter = waterFilter;
    }

    @Override
    public String filter() {
        return super.filter();
    }
    
    
    
}
