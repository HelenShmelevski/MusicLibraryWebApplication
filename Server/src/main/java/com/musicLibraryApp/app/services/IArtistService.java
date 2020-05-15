package com.musicLibraryApp.app.services;

import com.musicLibraryApp.app.dto.Artist;
import com.musicLibraryApp.app.dto.Track;

import java.util.List;

public interface IArtistService {
    List<Artist> getAllArtists();
    Artist getArtist(int artistId);
    List<Artist> getArtistsByGenre(int genreId);
    void addArtist(String name, String country, List<Track> tracks);
    void deleteArtist(int artistId);
    void updateArtist(int artistId, Artist newArtist);
}
