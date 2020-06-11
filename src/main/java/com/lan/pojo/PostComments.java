package com.lan.pojo;

import java.util.Date;

public class PostComments {
    private Integer postCommentsId;

    private String postCommentsAuthor;

    private Integer postCommentsPostId;

    private Date postCommentsAddtime;

    private Integer postCommentsPid;

    private String postCommentsContent;

    public Integer getPostCommentsId() {
        return postCommentsId;
    }

    public void setPostCommentsId(Integer postCommentsId) {
        this.postCommentsId = postCommentsId;
    }

    public String getPostCommentsAuthor() {
        return postCommentsAuthor;
    }

    public void setPostCommentsAuthor(String postCommentsAuthor) {
        this.postCommentsAuthor = postCommentsAuthor == null ? null : postCommentsAuthor.trim();
    }

    public Integer getPostCommentsPostId() {
        return postCommentsPostId;
    }

    public void setPostCommentsPostId(Integer postCommentsPostId) {
        this.postCommentsPostId = postCommentsPostId;
    }

    public Date getPostCommentsAddtime() {
        return postCommentsAddtime;
    }

    public void setPostCommentsAddtime(Date postCommentsAddtime) {
        this.postCommentsAddtime = postCommentsAddtime;
    }

    public Integer getPostCommentsPid() {
        return postCommentsPid;
    }

    public void setPostCommentsPid(Integer postCommentsPid) {
        this.postCommentsPid = postCommentsPid;
    }

    public String getPostCommentsContent() {
        return postCommentsContent;
    }

    public void setPostCommentsContent(String postCommentsContent) {
        this.postCommentsContent = postCommentsContent == null ? null : postCommentsContent.trim();
    }
}