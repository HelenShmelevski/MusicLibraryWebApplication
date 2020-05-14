package com.musicLibraryApp.app.dto;

import java.util.List;

public class Artist {
    private int id;
    private String name;
    private String country;
    private List<Track> tracks;

    public Artist(int id, String name, String country, List<Track> tracks) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.tracks = tracks;
    }

    public Artist() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry(){
        return country;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }
}
