package com.linux.designpatterns.compositepattern.composite;

import com.linux.designpatterns.compositepattern.HtmlTag;
import java.util.ArrayList;
import java.util.List;
import static org.apache.commons.lang3.StringUtils.EMPTY;
import org.slf4j.Logger;
import static org.slf4j.LoggerFactory.getLogger;

/**
 * This is the composite class that is still a element.
 * It implements required methods to become a composite.
 * @author Guruprasad Kulkarni <guru@linux.com>
 */
public class HtmlParentElement extends HtmlTag {

    private static final Logger LOG = getLogger(HtmlParentElement.class);

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
        startTag = EMPTY;
        endTag = EMPTY;
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
