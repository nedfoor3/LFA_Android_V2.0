package com.rawrstudio.lfa.model;

/**
 * Created by Ricardo Rodriguez on 3/3/2017.
 */
public class Medium_Large {
    private String file;
    private Integer width;
    private Integer height;
    private String mime_Type;
    private String source_Url;

    /**
     * Gets file.
     *
     * @return the file
     */
    public String getFile() {
        return file;
    }

    /**
     * Sets file.
     *
     * @param file the file
     */
    public void setFile(String file) {
        this.file = file;
    }

    /**
     * Gets width.
     *
     * @return the width
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * Sets width.
     *
     * @param width the width
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * Gets height.
     *
     * @return the height
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * Sets height.
     *
     * @param height the height
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * Gets mime type.
     *
     * @return the mime type
     */
    public String getMime_Type() {
        return mime_Type;
    }

    /**
     * Sets mime type.
     *
     * @param mime_Type the mime type
     */
    public void setMime_Type(String mime_Type) {
        this.mime_Type = mime_Type;
    }

    /**
     * Gets source url.
     *
     * @return the source url
     */
    public String getSource_Url() {
        return source_Url;
    }

    /**
     * Sets source url.
     *
     * @param source_Url the source url
     */
    public void setSource_Url(String source_Url) {
        this.source_Url = source_Url;
    }

    @Override
    public String toString() {
        return "Medium_Large{" +
                "file='" + file + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", mime_Type='" + mime_Type + '\'' +
                ", source_Url='" + source_Url + '\'' +
                '}';
    }
}
