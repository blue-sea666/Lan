package com.lan.pojo;

import java.util.Date;

public class BlogLog {
    private Integer blogLogId;

    private Date blogLogTime;

    private String blogLogContent;

    public Integer getBlogLogId() {
        return blogLogId;
    }

    public void setBlogLogId(Integer blogLogId) {
        this.blogLogId = blogLogId;
    }

    public Date getBlogLogTime() {
        return blogLogTime;
    }

    public void setBlogLogTime(Date blogLogTime) {
        this.blogLogTime = blogLogTime;
    }

    public String getBlogLogContent() {
        return blogLogContent;
    }

    public void setBlogLogContent(String blogLogContent) {
        this.blogLogContent = blogLogContent == null ? null : blogLogContent.trim();
    }
}