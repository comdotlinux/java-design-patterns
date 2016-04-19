package com.linux.designpatterns.decorator;

/**
 * 3. "Core" class with "is a" relationship
 * @author Guruprasad Kulkarni <guru@linux.com>
 */
public class WaterFilter implements Filter{
    
    @Override
    public String filter() {
        return "WaterFilter: filtering water...\n";
    }
}
