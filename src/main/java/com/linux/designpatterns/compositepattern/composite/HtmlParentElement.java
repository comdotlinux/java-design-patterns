/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linux.designpatterns.compositepattern.composite;

import com.linux.designpatterns.compositepattern.HtmlTag;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Guruprasad Kulkarni <guru@linux.com>
 */
public class HtmlParentElement extends HtmlTag {

    private static final Logger LOG = LoggerFactory.getLogger(HtmlParentElement.class);

    private final String tagName;
    private final List<HtmlTag> children;
    private String startTag;
    private String endTag;

    /**
     * Public and only Constructor which needs the tag name.
     *
     * @param tagName
     */
    public HtmlParentElement(String tagName) {
        this.tagName = tagName;
        children = new ArrayList<>();
    }

    /**
     * {@inheritDoc }
     */
    @Override
    public String getTagName() {
        return tagName;
    }

    /**
     * {@inheritDoc }
     */
    @Override
    public void setStartTag(String startTag) {
        this.startTag = startTag;
    }

    /**
     * {@inheritDoc }
     */
    @Override
    public void setEndTag(String endTag) {
        this.endTag = endTag;
    }

    /**
     * {@inheritDoc }
     */
    @Override
    public List<HtmlTag> getChildren() {
        return children;
    }

    /**
     * {@inheritDoc }
     */
    @Override
    public void addChildTag(HtmlTag htmlTag) {
        this.children.add(htmlTag);
    }

    /**
     * {@inheritDoc }
     */
    @Override
    public String generateHtml() {
        LOG.info(startTag);
        StringBuilder htmlBuilder = new StringBuilder(startTag);
        for (HtmlTag htmlTag : children) {
            LOG.info(htmlTag.generateHtml());
            htmlBuilder.append(htmlTag.generateHtml());
        }
        LOG.info(endTag);
        htmlBuilder.append(endTag);

        return htmlBuilder.toString();
    }

}
