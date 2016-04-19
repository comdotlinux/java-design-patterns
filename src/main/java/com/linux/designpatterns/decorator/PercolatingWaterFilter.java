package com.linux.designpatterns.decorator;

/**
 *
 * @author Guruprasad Kulkarni <guru@linux.com>
 */
public class PercolatingWaterFilter extends WaterFilterDecorator{
    
    public PercolatingWaterFilter(WaterFilter waterFilter) {
        super(waterFilter);
    }

    @Override
    public String filter() {
        return "PercolatingWaterFilter : Filtering with percolation filter....\n" + super.filter();
    }
    
    
}
