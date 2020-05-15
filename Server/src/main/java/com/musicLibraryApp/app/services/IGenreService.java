package com.musicLibraryApp.app.services;


import com.musicLibraryApp.app.dbModels.GenreDb;
import com.musicLibraryApp.app.dto.Genre;

import java.util.List;

public interface IGenreService {
    List<Genre> getAllGenre();
    Genre getGenre(int genreId);
    void addGenre(String string);
    void deleteGenre(int genreId);
    void updateGenre(int genreId, Genre newGenre);
}
