package com.musicLibraryApp.app.dto;

public class ArtistShortInfo {
    private int artistId;
    private String name;
    private String country;

    public ArtistShortInfo(int artistId, String name, String country) {
        this.artistId = artistId;
        this.name = name;
        this.country = country;
    }

    public ArtistShortInfo() { }

    public int getArtistId() {
        return artistId;
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
