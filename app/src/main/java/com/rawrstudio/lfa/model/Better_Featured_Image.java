package com.rawrstudio.lfa.model;

/**
 * Created by Ricardo Rodriguez on 3/3/2017.
 */
public class Better_Featured_Image {

    private String description;
    private String media_type;
    private Media_Details media_details;
    private String source_url;

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets media type.
     *
     * @return the media type
     */
    public String getMedia_type() {
        return media_type;
    }

    /**
     * Sets media type.
     *
     * @param media_type the media type
     */
    public void setMedia_type(String media_type) {
        this.media_type = media_type;
    }

    /**
     * Gets media details.
     *
     * @return the media details
     */
    public Media_Details getMedia_details() {
        return media_details;
    }

    /**
     * Sets media details.
     *
     * @param media_details the media details
     */
    public void setMedia_details(Media_Details media_details) {
        this.media_details = media_details;
    }

    /**
     * Gets source url.
     *
     * @return the source url
     */
    public String getSource_url() {
        return source_url;
    }

    /**
     * Sets source url.
     *
     * @param source_url the source url
     */
    public void setSource_url(String source_url) {
        this.source_url = source_url;
    }

    @Override
    public String toString() {
        return "Better_Featured_Image{" +
                "description='" + description + '\'' +
                ", media_type='" + media_type + '\'' +
                ", media_details=" + media_details +
                ", source_url='" + source_url + '\'' +
                '}';
    }
}
