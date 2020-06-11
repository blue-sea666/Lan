package com.lan.pojo;

public class Users {
    private Integer userId;

    private String usersName;

    private String usersPassword;

    private String usersHeadimg;

    private String usersSignature;

    private String usersSex;

    private String usersGithubLink;

    private String usersQq;

    private String suersEmail;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsersName() {
        return usersName;
    }

    public void setUsersName(String usersName) {
        this.usersName = usersName == null ? null : usersName.trim();
    }

    public String getUsersPassword() {
        return usersPassword;
    }

    public void setUsersPassword(String usersPassword) {
        this.usersPassword = usersPassword == null ? null : usersPassword.trim();
    }

    public String getUsersHeadimg() {
        return usersHeadimg;
    }

    public void setUsersHeadimg(String usersHeadimg) {
        this.usersHeadimg = usersHeadimg == null ? null : usersHeadimg.trim();
    }

    public String getUsersSignature() {
        return usersSignature;
    }

    public void setUsersSignature(String usersSignature) {
        this.usersSignature = usersSignature == null ? null : usersSignature.trim();
    }

    public String getUsersSex() {
        return usersSex;
    }

    public void setUsersSex(String usersSex) {
        this.usersSex = usersSex == null ? null : usersSex.trim();
    }

    public String getUsersGithubLink() {
        return usersGithubLink;
    }

    public void setUsersGithubLink(String usersGithubLink) {
        this.usersGithubLink = usersGithubLink == null ? null : usersGithubLink.trim();
    }

    public String getUsersQq() {
        return usersQq;
    }

    public void setUsersQq(String usersQq) {
        this.usersQq = usersQq == null ? null : usersQq.trim();
    }

    public String getSuersEmail() {
        return suersEmail;
    }

    public void setSuersEmail(String suersEmail) {
        this.suersEmail = suersEmail == null ? null : suersEmail.trim();
    }
}