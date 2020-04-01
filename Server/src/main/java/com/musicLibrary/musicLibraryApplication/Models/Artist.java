package com.musicLibrary.musicLibraryApplication.Models;

import com.musicLibrary.musicLibraryApplication.dto.ArtistDTO;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "ARTISTS")
public class Artist implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "A_SEQ")
    @SequenceGenerator(sequenceName = "ARTIST_SEQ", allocationSize = 1, name = "A_SEQ")
    @Column(name = "ARTIST_ID")
    private int artistId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "COUNTRY")
    private String country;

    @OneToMany(mappedBy = "artist", fetch = FetchType.LAZY)
    private Set<Track> tracks;

    public Artist(int artistId, String name, String country, Set<Track> tracks) {
        this.artistId = artistId;
        this.name = name;
        this.country = country;
        this.tracks = tracks;
    }

    public Artist(ArtistDTO artistDTO) {
        this.artistId = artistDTO.getId();
        this.name = artistDTO.getName();
        this.country = artistDTO.getCountry();
        this.tracks = artistDTO.getTracks();
    }

    public Artist() {}

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
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

    public Set<Track> getTracks() {
        return tracks;
    }

    public void setTracks(Set<Track> tracks) {
        this.tracks = tracks;
    }
}