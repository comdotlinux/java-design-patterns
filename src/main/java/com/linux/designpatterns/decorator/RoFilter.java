package com.linux.designpatterns.decorator;

/**
 *
 * @author Guruprasad Kulkarni <guru@linux.com>
 */
public class RoFilter extends WaterFilterDecorator{
    
    public RoFilter(Filter filter) {
        super(filter);
    }

    @Override
    public String filter() {
        return super.filter() + this.getClass().getSimpleName() + ": Performing Reverse Osmosis....\n";
    }
    
}
