package com.rawrstudio.lfa.model;

/**
 * Created by Ricardo Rodriguez on 3/3/2017.
 */
public class Sizes {
    private Thumbnail thumbnail;
    private Medium medium;
    private Medium_Large medium_Large;
    private Large large;
    private Twentyseventeen_Thumbnail_Avatar twentyseventeenThumbnailAvatar;

    /**
     * Gets thumbnail.
     *
     * @return the thumbnail
     */
    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    /**
     * Sets thumbnail.
     *
     * @param thumbnail the thumbnail
     */
    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    /**
     * Gets medium.
     *
     * @return the medium
     */
    public Medium getMedium() {
        return medium;
    }

    /**
     * Sets medium.
     *
     * @param medium the medium
     */
    public void setMedium(Medium medium) {
        this.medium = medium;
    }

    /**
     * Gets medium large.
     *
     * @return the medium large
     */
    public Medium_Large getMedium_Large() {
        return medium_Large;
    }

    /**
     * Sets medium large.
     *
     * @param medium_Large the medium large
     */
    public void setMedium_Large(Medium_Large medium_Large) {
        this.medium_Large = medium_Large;
    }

    /**
     * Gets large.
     *
     * @return the large
     */
    public Large getLarge() {
        return large;
    }

    /**
     * Sets large.
     *
     * @param large the large
     */
    public void setLarge(Large large) {
        this.large = large;
    }

    /**
     * Gets twentyseventeen thumbnail avatar.
     *
     * @return the twentyseventeen thumbnail avatar
     */
    public Twentyseventeen_Thumbnail_Avatar getTwentyseventeenThumbnailAvatar() {
        return twentyseventeenThumbnailAvatar;
    }

    /**
     * Sets twentyseventeen thumbnail avatar.
     *
     * @param twentyseventeenThumbnailAvatar the twentyseventeen thumbnail avatar
     */
    public void setTwentyseventeenThumbnailAvatar(Twentyseventeen_Thumbnail_Avatar twentyseventeenThumbnailAvatar) {
        this.twentyseventeenThumbnailAvatar = twentyseventeenThumbnailAvatar;
    }

    @Override
    public String toString() {
        return "Sizes{" +
                "thumbnail=" + thumbnail +
                ", medium=" + medium +
                ", medium_Large=" + medium_Large +
                ", large=" + large +
                ", twentyseventeenThumbnailAvatar=" + twentyseventeenThumbnailAvatar +
                '}';
    }
}
