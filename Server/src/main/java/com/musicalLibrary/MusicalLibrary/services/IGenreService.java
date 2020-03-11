package com.musicalLibrary.MusicalLibrary.services;

import com.musicalLibrary.MusicalLibrary.models.Genre;

public interface IGenreService {
    Genre[] getAllGenre();
    Genre getGenre(int genreId);
    void addGenre(Genre genre);
    void deleteGenre(int genreId);
    void updateGenre(int genreId, Genre newGenre);
}
