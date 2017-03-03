package com.rawrstudio.lfa.model;

/**
 * Created by Ricardo Rodriguez on 3/3/2017.
 */
public class Content {
    private String rendered;

    /**
     * Gets rendered.
     *
     * @return the rendered
     */
    public String getRendered() {
        return rendered;
    }

    /**
     * Sets rendered.
     *
     * @param rendered the rendered
     */
    public void setRendered(String rendered) {
        this.rendered = rendered;
    }

    @Override
    public String toString() {
        return "Content{" +
                "rendered='" + rendered + '\'' +
                '}';
    }
}
