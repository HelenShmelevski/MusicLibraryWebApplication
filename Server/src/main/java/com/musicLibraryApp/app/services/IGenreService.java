package com.musicLibraryApp.app.services;


import com.musicLibraryApp.app.dbModels.GenreDb;

public interface IGenreService {
    GenreDb[] getAllGenre();
    GenreDb getGenre(int genreId);
    void addGenre(String string);
    void deleteGenre(int genreId);
    void updateGenre(int genreId, GenreDb newGenre);
}
