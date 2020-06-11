package com.lan.pojo;

public class About {
    private Integer aboutId;

    private String aboutContent;

    public Integer getAboutId() {
        return aboutId;
    }

    public void setAboutId(Integer aboutId) {
        this.aboutId = aboutId;
    }

    public String getAboutContent() {
        return aboutContent;
    }

    public void setAboutContent(String aboutContent) {
        this.aboutContent = aboutContent == null ? null : aboutContent.trim();
    }
}