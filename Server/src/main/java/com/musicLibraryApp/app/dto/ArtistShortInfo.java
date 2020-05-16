package com.musicLibraryApp.app.dto;

public class ArtistShortInfo {
    private int id;
    private String name;
    private String country;

    public ArtistShortInfo(int id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public ArtistShortInfo() { }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
