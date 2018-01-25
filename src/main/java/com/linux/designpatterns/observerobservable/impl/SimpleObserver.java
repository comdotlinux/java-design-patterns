/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linux.designpatterns.observerobservable.impl;

import com.linux.designpatterns.observerobservable.Observer;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleObserver implements Observer<String> {

    private final String name;

    /**
     * Constructor for setting Name of Observer
     *
     * @param name
     */
    public SimpleObserver(String name) {
        this.name = name;
    }

    private static final Logger LOG = LoggerFactory.getLogger(SimpleObserver.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public void updated(String t) {
        LOG.info("Updated {} with data {}.", this, t);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append(name).toString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        SimpleObserver rhs = (SimpleObserver) obj;
        return new EqualsBuilder().append(name, rhs.name).isEquals();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return new HashCodeBuilder(5, 13).append(name).toHashCode();
    }

}
