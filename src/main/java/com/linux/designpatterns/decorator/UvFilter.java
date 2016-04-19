package com.linux.designpatterns.decorator;

/**
 *
 * @author Guruprasad Kulkarni <guru@linux.com>
 */
public class UvFilter extends WaterFilterDecorator{
    
    public UvFilter(Filter filter) {
        super(filter);
    }

    @Override
    public String filter() {
        return super.filter() + this.getClass().getSimpleName() + ": passing water under high intensity Ultra Violet Lamp...\n";
    }
    
    
}
