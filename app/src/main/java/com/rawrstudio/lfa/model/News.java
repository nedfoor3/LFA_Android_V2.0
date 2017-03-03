package com.rawrstudio.lfa.model;

/**
 * News
 * Created by Ricardo on 26/02/2017.
 */
public class News {

    private Integer id;
    private String date;
    private String type;
    private String link;
    private Title title;
    private Content content;
    private Better_Featured_Image better_featured_image;

    /**
     * Gets id.
     *
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets date.
     *
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets link.
     *
     * @return the link
     */
    public String getLink() {
        return link;
    }

    /**
     * Sets link.
     *
     * @param link the link
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * Gets title.
     *
     * @return the title
     */
    public Title getTitle() {
        return title;
    }

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(Title title) {
        this.title = title;
    }

    /**
     * Gets content.
     *
     * @return the content
     */
    public Content getContent() {
        return content;
    }

    /**
     * Sets content.
     *
     * @param content the content
     */
    public void setContent(Content content) {
        this.content = content;
    }

    /**
     * Gets better featured image.
     *
     * @return the better featured image
     */
    public Better_Featured_Image getBetter_featured_image() {
        return better_featured_image;
    }

    /**
     * Sets better featured image.
     *
     * @param better_featured_image the better featured image
     */
    public void setBetter_featured_image(Better_Featured_Image better_featured_image) {
        this.better_featured_image = better_featured_image;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", type='" + type + '\'' +
                ", link='" + link + '\'' +
                ", title=" + title +
                ", content=" + content +
                ", better_featured_image=" + better_featured_image +
                '}';
    }
}
