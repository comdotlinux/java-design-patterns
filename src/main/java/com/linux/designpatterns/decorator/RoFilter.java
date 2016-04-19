package com.linux.designpatterns.decorator;

/**
 *
 * @author Guruprasad Kulkarni <guru@linux.com>
 */
public class RoFilter extends WaterFilterDecorator{
    
    public RoFilter(WaterFilter waterFilter) {
        super(waterFilter);
    }

    @Override
    public String filter() {
        return "RoFilter: Performing Reverse Osmosis....\n" + super.filter();
    }
    
}
