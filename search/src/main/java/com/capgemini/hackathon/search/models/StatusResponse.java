package com.capgemini.hackathon.search.models;

public class StatusResponse {
    private String statusId;
    private boolean isSuccessful;

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public boolean isSuccessful() {
        return isSuccessful;
    }

    public void setSuccessful(boolean successful) {
        isSuccessful = successful;
    }


}
