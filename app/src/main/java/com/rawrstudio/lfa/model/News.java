package com.rawrstudio.lfa.model;

/** News
 * Created by Ricardo on 26/02/2017.
 */
public class News {

    private Integer id;
    private String date;
    private String dateGmt;
    private String slug;
    private String type;
    private String link;
    private Title title;
    private String author;
    private String featuredMedia;
    private String pingStatus;

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
     * Gets date gmt.
     *
     * @return the date gmt
     */
    public String getDateGmt() {
        return dateGmt;
    }

    /**
     * Sets date gmt.
     *
     * @param dateGmt the date gmt
     */
    public void setDateGmt(String dateGmt) {
        this.dateGmt = dateGmt;
    }

    /**
     * Gets slug.
     *
     * @return the slug
     */
    public String getSlug() {
        return slug;
    }

    /**
     * Sets slug.
     *
     * @param slug the slug
     */
    public void setSlug(String slug) {
        this.slug = slug;
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
     * Gets author.
     *
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets author.
     *
     * @param author the author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Gets featured media.
     *
     * @return the featured media
     */
    public String getFeaturedMedia() {
        return featuredMedia;
    }

    /**
     * Sets featured media.
     *
     * @param featuredMedia the featured media
     */
    public void setFeaturedMedia(String featuredMedia) {
        this.featuredMedia = featuredMedia;
    }

    /**
     * Gets ping status.
     *
     * @return the ping status
     */
    public String getPingStatus() {
        return pingStatus;
    }

    /**
     * Sets ping status.
     *
     * @param pingStatus the ping status
     */
    public void setPingStatus(String pingStatus) {
        this.pingStatus = pingStatus;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", dateGmt='" + dateGmt + '\'' +
                ", slug='" + slug + '\'' +
                ", type='" + type + '\'' +
                ", link='" + link + '\'' +
                ", title=" + title +
                ", author='" + author + '\'' +
                ", featuredMedia='" + featuredMedia + '\'' +
                ", pingStatus='" + pingStatus + '\'' +
                '}';
    }
}
