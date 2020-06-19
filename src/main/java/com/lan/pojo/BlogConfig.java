package com.lan.pojo;

public class BlogConfig {
    private Integer configId;

    private String configName;

    private String configCopyright;

    private String configIpc;

    private String configSignature;

    public Integer getConfigId() {
        return configId;
    }

    public void setConfigId(Integer configId) {
        this.configId = configId;
    }

    public String getConfigName() {
        return configName;
    }

    public void setConfigName(String configName) {
        this.configName = configName == null ? null : configName.trim();
    }

    public String getConfigCopyright() {
        return configCopyright;
    }

    public void setConfigCopyright(String configCopyright) {
        this.configCopyright = configCopyright == null ? null : configCopyright.trim();
    }

    public String getConfigIpc() {
        return configIpc;
    }

    public void setConfigIpc(String configIpc) {
        this.configIpc = configIpc == null ? null : configIpc.trim();
    }

    public String getConfigSignature() {
        return configSignature;
    }

    public void setConfigSignature(String configSignature) {
        this.configSignature = configSignature == null ? null : configSignature.trim();
    }
}