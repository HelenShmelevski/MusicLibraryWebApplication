package com.musicLibraryApp.app.dbModels;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.musicLibraryApp.app.dto.Artist;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Table(name = "ARTISTS")
public class ArtistDb implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "A_SEQ")
    @SequenceGenerator(sequenceName = "ARTIST_SEQ", allocationSize = 1, name = "A_SEQ")
    @Column(name = "ARTIST_ID")
    private int artistId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "COUNTRY")
    private String country;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "artist", fetch = FetchType.EAGER)
    private List<TrackDb> tracks;

    public ArtistDb(String name, String country, List<TrackDb> tracks) {
        this.name = name;
        this.country = country;
        this.tracks = tracks;
    }

    public ArtistDb(Artist artist) {
        this.artistId = artist.getId();
        this.name = artist.getName();
        this.country = artist.getCountry();
        this.tracks = artist
                .getTracks()
                .stream()
                .map(TrackDb::new)
                .collect(Collectors.toList());
    }

    public ArtistDb() {}

    public int getArtistId() {
        return artistId;
    }

    private void setArtistId(int artistId) {
        this.artistId = artistId;
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

    public List<TrackDb> getTracks() {
        return tracks;
    }

    public void setTracks(List<TrackDb> tracks) {
        this.tracks = tracks;
    }
}