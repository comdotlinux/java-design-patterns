package com.linux.designpatterns.compositepattern.leaf;

import com.linux.designpatterns.compositepattern.HtmlTag;
import static org.apache.commons.lang3.StringUtils.EMPTY;
import org.slf4j.Logger;
import static org.slf4j.LoggerFactory.getLogger;

/**
 * The Leaf class that represents a HTML Element
 * It only implements the abstract methods that are required for the leaf.
 * @author Guruprasad Kulkarni <guru@linux.com>
 */
public class HtmlElement extends HtmlTag{

    private static final Logger LOG = getLogger(HtmlElement.class);
    
    private final String tagName;
    private String startTag;
    private String endTag;
    private String tagBody;

    /**
     * Public and only Constructor which needs the tag name.
     *
     * @param tagName set the TagName 
     */
    public HtmlElement(String tagName){
        this.tagName = tagName;
        this.startTag = EMPTY;
        this.endTag = EMPTY;
    }
    
    /**
     * {@inheritDoc }
     */
    @Override
    public String getTagName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public void setTagBody(String tagBody) {
        this.tagBody = tagBody;
    }

    /**
     * {@inheritDoc }
     */
    @Override
    public String generateHtml() {
        LOG.info(startTag);
        StringBuilder htmlBuilder = new StringBuilder(startTag);
        
        LOG.info(tagBody);
        LOG.info(endTag);
        htmlBuilder.append(tagBody).append(endTag);
        
        return htmlBuilder.toString();
    }
    
}
