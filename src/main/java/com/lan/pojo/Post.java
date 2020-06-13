package com.lan.pojo;

import java.util.Date;

public class Post {
    private Integer page;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    private Integer limit;
    private String userName;

    private Integer postId;

    private String postTitle;

    private Date postAddtime;

    private Date postUpdatetime;

    private Integer postClassifyId;

    private String classifyName;

    private Integer postBrowse;

    private Integer postUsersId;

    private String postLink;

    private String postCopyright;

    private String postLabel1Name;

    private String postLabel2Name;

    private String postLabel3Name;

    private Integer postLabel1Id;

    private Integer postLabel2Id;

    private Integer postLabel3Id;

    private String postContent;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getClassifyName() {
        return classifyName;
    }

    public void setClassifyName(String classifyName) {
        this.classifyName = classifyName;
    }

    public String getPostLabel1Name() {
        return postLabel1Name;
    }

    public void setPostLabel1Name(String postLabel1Name) {
        this.postLabel1Name = postLabel1Name;
    }

    public String getPostLabel2Name() {
        return postLabel2Name;
    }

    public void setPostLabel2Name(String postLabel2Name) {
        this.postLabel2Name = postLabel2Name;
    }

    public String getPostLabel3Name() {
        return postLabel3Name;
    }

    public void setPostLabel3Name(String postLabel3Name) {
        this.postLabel3Name = postLabel3Name;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle == null ? null : postTitle.trim();
    }

    public Date getPostAddtime() {
        return postAddtime;
    }

    public void setPostAddtime(Date postAddtime) {
        this.postAddtime = postAddtime;
    }

    public Date getPostUpdatetime() {
        return postUpdatetime;
    }

    public void setPostUpdatetime(Date postUpdatetime) {
        this.postUpdatetime = postUpdatetime;
    }

    public Integer getPostClassifyId() {
        return postClassifyId;
    }

    public void setPostClassifyId(Integer postClassifyId) {
        this.postClassifyId = postClassifyId;
    }

    public Integer getPostBrowse() {
        return postBrowse;
    }

    public void setPostBrowse(Integer postBrowse) {
        this.postBrowse = postBrowse;
    }

    public Integer getPostUsersId() {
        return postUsersId;
    }

    public void setPostUsersId(Integer postUsersId) {
        this.postUsersId = postUsersId;
    }

    public String getPostLink() {
        return postLink;
    }

    public void setPostLink(String postLink) {
        this.postLink = postLink == null ? null : postLink.trim();
    }

    public String getPostCopyright() {
        return postCopyright;
    }

    public void setPostCopyright(String postCopyright) {
        this.postCopyright = postCopyright == null ? null : postCopyright.trim();
    }

    public Integer getPostLabel1Id() {
        return postLabel1Id;
    }

    public void setPostLabel1Id(Integer postLabel1Id) {
        this.postLabel1Id = postLabel1Id;
    }

    public Integer getPostLabel2Id() {
        return postLabel2Id;
    }

    public void setPostLabel2Id(Integer postLabel2Id) {
        this.postLabel2Id = postLabel2Id;
    }

    public Integer getPostLabel3Id() {
        return postLabel3Id;
    }

    public void setPostLabel3Id(Integer postLabel3Id) {
        this.postLabel3Id = postLabel3Id;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent == null ? null : postContent.trim();
    }
}