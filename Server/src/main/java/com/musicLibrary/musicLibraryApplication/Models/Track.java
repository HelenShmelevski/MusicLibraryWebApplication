package com.musicLibrary.musicLibraryApplication.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.musicLibrary.musicLibraryApplication.dto.TrackDTO;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "TRACKS")
public class Track implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "T_SEQ")
    @SequenceGenerator(sequenceName = "TRACK_SEQ", allocationSize = 1, name = "T_SEQ")
    @Column(name = "TRACK_ID")
    private int trackId;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "ALBUM")
    private String album;

    @Column(name = "DATE_RELEASE")
    private Date dateRelease;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ARTIST_ID", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Artist artist;

    public Track(int trackId, String title, String album,Date dateRelease, Artist artist) {
        this.trackId = trackId;
        this.title = title;
        this.album = album;
        this.dateRelease = dateRelease;
        this.artist = artist;
    }

    public Track(TrackDTO trackDTO) {
        this.trackId = trackDTO.getId();
        this.title = trackDTO.getTitle();
        this.album = trackDTO.getAlbum();
        this.dateRelease = trackDTO.getDateRelease();
    }

    public Track() {}

    @JsonIgnore
    public Artist getArtist() {
        return artist;
    }

    @JsonIgnore
    public void setArtist(Artist artist) {
        this.artist = artist;
    }

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

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }
}
