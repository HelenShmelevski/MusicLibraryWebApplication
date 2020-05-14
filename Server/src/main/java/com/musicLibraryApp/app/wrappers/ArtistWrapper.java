package com.musicLibraryApp.app.wrappers;

import com.musicLibraryApp.app.dto.Track;

import java.util.List;

public class ArtistWrapper {
    private String name;
    private String country;
    private List<Track> tracks;

    public ArtistWrapper(){}

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

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }
}
