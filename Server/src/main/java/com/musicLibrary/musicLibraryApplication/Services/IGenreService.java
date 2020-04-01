package com.musicLibrary.musicLibraryApplication.Services;


import com.musicLibrary.musicLibraryApplication.Models.Genre;

public interface IGenreService {
    Genre[] getAllGenre();
    Genre getGenre(int genreId);
    void addGenre(Genre genre);
    void deleteGenre(int genreId);
    void updateGenre(int genreId, Genre newGenre);
}
