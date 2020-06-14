package com.lan.pojo;

import java.util.Date;

public class Leave {
    private Integer leaveId;

    private Integer leavePid;

    private String leaveUsername;

    private Date leaveTime;

    private String leaveContent;

    public Integer getLeaveId() {
        return leaveId;
    }

    public void setLeaveId(Integer leaveId) {
        this.leaveId = leaveId;
    }

    public Integer getLeavePid() {
        return leavePid;
    }

    public void setLeavePid(Integer leavePid) {
        this.leavePid = leavePid;
    }

    public String getLeaveUsername() {
        return leaveUsername;
    }

    public void setLeaveUsername(String leaveUsername) {
        this.leaveUsername = leaveUsername;
    }

    public Date getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }

    public String getLeaveContent() {
        return leaveContent;
    }

    public void setLeaveContent(String leaveContent) {
        this.leaveContent = leaveContent;
    }
}