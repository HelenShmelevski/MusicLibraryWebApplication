package com.musicLibraryApp.app.services;

public interface IArtistsGenresService {
    void add(int artistId, int genreId);
    void deleteByArtistId(int artistId);
}
