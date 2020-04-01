package com.musicLibrary.musicLibraryApplication.Models;

import com.musicLibrary.musicLibraryApplication.dto.GenreDTO;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "GENRES")
public class Genre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "G_SEQ")
    @SequenceGenerator(sequenceName = "GENRE_SEQ", allocationSize = 1, name = "G_SEQ")
    @Column(name = "GENRE_ID")
    private int genreId;

    @Column(name = "TITLE")
    private String title;

    public Genre(String title) {
        this.title = title;
    }

    public Genre(GenreDTO genreDTO) {
        this.genreId = genreDTO.getId();
        this.title = genreDTO.getTitle();
    }

    public Genre() {}

    public int getGenreId() {
        return genreId;
    }

    public int setGenreId() {
        return genreId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
