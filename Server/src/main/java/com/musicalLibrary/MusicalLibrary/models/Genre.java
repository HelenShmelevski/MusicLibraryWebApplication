package com.musicalLibrary.MusicalLibrary.models;

import org.hibernate.annotations.Generated;

import javax.persistence.*;

@Entity
@Table(name = "GENRES")
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int genreId;

    @Column(name = "TITLE")
    private String title;


    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
