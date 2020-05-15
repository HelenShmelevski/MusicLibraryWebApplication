package com.musicLibraryApp.app.dbModels;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.musicLibraryApp.app.dto.Track;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "TRACKS")
public class TrackDb implements Serializable {
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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ARTIST_ID", nullable = false)
    @JsonIgnore
    private ArtistDb artist;

    public TrackDb(String title, String album, Date dateRelease, ArtistDb artist) {
        this.title = title;
        this.album = album;
        this.dateRelease = dateRelease;
        this.artist = artist;
    }

    public TrackDb(Track track) {
        this.trackId = track.getId();
        this.title = track.getTitle();
        this.album = track.getAlbum();
        this.dateRelease = track.getDateRelease();
    }

    public TrackDb() {}

    public ArtistDb getArtist() {
        return artist;
    }

    public void setArtist(ArtistDb artist) {
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

    private void setTrackId(int trackId) {
        this.trackId = trackId;
    }
}
