package com.capgemini.hackathon.search.models;

import java.util.Date;

public class StatusRequest {

    private String userId;
    private String status;
    private Date dataTimePosted;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataTimePosted() {
        return dataTimePosted;
    }

    public void setDataTimePosted(Date dataTimePosted) {
        this.dataTimePosted = dataTimePosted;
    }
}
