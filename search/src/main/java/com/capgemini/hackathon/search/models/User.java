package com.capgemini.hackathon.search.models;


public class User {

    private String id;

    private String name;

    private String picture;

    private String position;

    private String skills;

    private String methodOfCommunication;

    private String currentLocation;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    public String getSkills() {
        return skills;
    }


    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getMethodOfCommunication() {
        return methodOfCommunication;
    }

    public void setMethodOfCommunication(String methodOfCommunication) {
        this.methodOfCommunication = methodOfCommunication;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }
}