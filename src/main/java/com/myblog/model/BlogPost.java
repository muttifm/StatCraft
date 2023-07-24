package com.myblog.model;

import java.util.Date;

public class BlogPost {
    private String id;
    private String title;
    private String content;
    private String authorId;
    private Date dateCreated;
    private Date lastUpdated;

    // Constructors, getters and setters...

    public BlogPost() {
    }

    public BlogPost(String id, String title, String content, String authorId, Date dateCreated, Date lastUpdated) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.authorId = authorId;
        this.dateCreated = dateCreated;
        this.lastUpdated = lastUpdated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
