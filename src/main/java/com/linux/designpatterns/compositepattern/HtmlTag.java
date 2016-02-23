package com.linux.designpatterns.compositepattern;

import java.util.List;

/**
 * This class represents a HTML Tag.<br>
 * It has required methods for<br>
 * <ol>
 *  <li>Add child</li>
 *  <li>Remove child</li>
 *  <li>set start tag</li>
 *  <li>set end tag</li>
 *  <li>Operation : generateHtml</li>
 * </ol>
 * <br>
 * 
 * @author Guruprasad Kulkarni <guru@linux.com>
 */
public abstract class HtmlTag {
    public abstract String getTagName();
    public abstract void setStartTag(String tagName);
    public abstract void setEndTag(String tagName);
    
    /**
     * set the tag body value.
     * @param tagBody to set
     */
    public void setTagBody(String tagBody){
        throw new UnsupportedOperationException("Operation not supported for this object.");
    }
    
    /**
     * Add a child to this HTML Element
     * @param htmlTag instance of {@linkplain HtmlTag} to add as a child.
     */
    public void addChildTag(HtmlTag htmlTag){
         throw new UnsupportedOperationException("Operation not supported for this object.");
    }
    
    /**
     * Remove a child tag of this Composite.
     * @param htmlTag to remove
     */
    public void removeChildTag(HtmlTag htmlTag){
        throw new UnsupportedOperationException("Operation not supported for this object.");
    }
    
    /**
     * Get the List of children composites and leaves.
     * @return the {@linkplain List} of {@linkplain HtmlTag}
     */
    public List<HtmlTag> getChildren(){
        throw new UnsupportedOperationException("Operation not supported for this object.");
    }
    
    /**
     * The Operation method that generates the HTML markup.
     * @return generated markup as String.
     */
    public abstract String generateHtml();
}
