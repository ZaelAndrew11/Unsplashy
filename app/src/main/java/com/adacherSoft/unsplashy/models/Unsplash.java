package com.adacherSoft.unsplashy.models;

public class Unsplash {
    private String color;
    private String created_at;
    private Object description;
    private boolean liked_by_user;
    private UnsplashUrls urls;
    private String updated_at;
    private int downloads;
    private int width;
    private String id;
    private UnsplashUser user;
    private Object slug;
    private int views;
    private int height;
    private int likes;

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCreated_at() {
        return this.created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public Object getDescription() {
        return this.description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public boolean getLiked_by_user() {
        return this.liked_by_user;
    }

    public void setLiked_by_user(boolean liked_by_user) {
        this.liked_by_user = liked_by_user;
    }

    public UnsplashUrls getUrls() {
        return this.urls;
    }

    public void setUrls(UnsplashUrls urls) {
        this.urls = urls;
    }

    public String getUpdated_at() {
        return this.updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public int getDownloads() {
        return this.downloads;
    }

    public void setDownloads(int downloads) {
        this.downloads = downloads;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UnsplashUser getUser() {
        return this.user;
    }

    public void setUser(UnsplashUser user) {
        this.user = user;
    }

    public Object getSlug() {
        return this.slug;
    }

    public void setSlug(Object slug) {
        this.slug = slug;
    }

    public int getViews() {
        return this.views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLikes() {
        return this.likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

}
