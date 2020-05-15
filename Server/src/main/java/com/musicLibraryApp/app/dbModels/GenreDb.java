package com.musicLibraryApp.app.dbModels;

import com.musicLibraryApp.app.dto.Genre;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "GENRES")
public class GenreDb implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "G_SEQ")
    @SequenceGenerator(sequenceName = "GENRE_SEQ", allocationSize = 1, name = "G_SEQ")
    @Column(name = "GENRE_ID")
    private int genreId;

    @Column(name = "TITLE")
    private String title;

    public GenreDb(String title) {
        this.title = title;
    }

    public GenreDb(Genre genreDTO) {
        this.genreId = genreDTO.getId();
        this.title = genreDTO.getTitle();
    }

    public GenreDb() {}

    public int getGenreId() {
        return genreId;
    }

    private int setGenreId() {
        return genreId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
