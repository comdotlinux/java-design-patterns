package com.linux.designpatterns.decorator;

/**
 * 2. Second level base class with "is-a" relationship
 * @author Guruprasad Kulkarni <guru@linux.com>
 */
public abstract class WaterFilterDecorator implements Filter{
    
    protected Filter filter;
    
    public WaterFilterDecorator(Filter filter) {
        this.filter = filter;
    }

    // Delegate to Super for filtering.
    @Override
    public String filter() {
        return filter.filter();
    }
    
    
    
}
