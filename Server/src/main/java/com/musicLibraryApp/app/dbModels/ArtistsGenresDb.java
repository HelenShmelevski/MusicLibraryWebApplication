package com.musicLibraryApp.app.dbModels;

import javax.persistence.*;

@Entity
@Table(name = "ARTISTS_GENRES")
public class ArtistsGenresDb {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AG_SEQ")
    @SequenceGenerator(sequenceName = "ARTIST_GENRES_SEQ", allocationSize = 1, name = "AG_SEQ")
    @Column(name = "ID")
    private int Id;

    @Column(name = "ARTIST_ID")
    private int artistId;

    @Column(name = "GENRE_ID")
    private int genreId;

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public int getArtistId() {
        return artistId;
    }

    public int getGenreId() {
        return genreId;
    }

    public int getNumberId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }

}
