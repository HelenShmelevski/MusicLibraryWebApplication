package com.musicLibraryApp.app.dto;

import java.util.Date;

public class Track {

    private int id;
    private String title;
    private String album;
    private Date dateRelease;
    private ArtistShortInfo artist;

    public Track(int id, String title, String album, Date dateRelease, ArtistShortInfo artist) {
        this.id = id;
        this.title = title;
        this.album = album;
        this.dateRelease = dateRelease;
        this.artist = artist;
    }

    public Track() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlbum(){
        return album;
    }

    public void setAlbum(String album){
        this.album = album;
    }

    public Date getDateRelease() {
        return dateRelease;
    }

    public void setDateRelease(Date dateRelease) {
        this.dateRelease = dateRelease;
    }

    public ArtistShortInfo getArtist() {
        return artist;
    }

    public void setArtist(ArtistShortInfo artist) {
        this.artist = artist;
    }
}
