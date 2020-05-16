package com.musicLibraryApp.app.wrappers;

import com.musicLibraryApp.app.dto.ArtistShortInfo;

import java.util.Date;

public class TrackWrapper {
    private String title;
    private String album;
    private Date dateRelease;
    private int artistId;

    public TrackWrapper() {}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public Date getDateRelease() {
        return dateRelease;
    }

    public void setDateRelease(Date dateRelease) {
        this.dateRelease = dateRelease;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }
}
