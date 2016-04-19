/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linux.designpatterns.decorator;

/**
 *
 * @author Guruprasad Kulkarni <guru@linux.com>
 */
public class WaterPolisher extends WaterFilterDecorator{
    
    public WaterPolisher(WaterFilter waterFilter) {
        super(waterFilter);
    }

    @Override
    public String filter() {
        return "WaterPolisher: Polishing water color using propritery technology...\n" + super.filter();
    }
    
    
}
