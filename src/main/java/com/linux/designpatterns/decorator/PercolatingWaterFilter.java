package com.linux.designpatterns.decorator;

/**
 *
 * @author Guruprasad Kulkarni <guru@linux.com>
 */
public class PercolatingWaterFilter extends WaterFilterDecorator{
    
    public PercolatingWaterFilter(Filter filter) {
        super(filter);
    }

    @Override
    public String filter() {
        return super.filter() + this.getClass().getSimpleName() + ": Filtering with percolation filter....\n";
    }
    
    
}
