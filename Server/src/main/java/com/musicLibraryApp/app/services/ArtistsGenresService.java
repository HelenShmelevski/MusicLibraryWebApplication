package com.musicLibraryApp.app.services;

import com.musicLibraryApp.app.dbModels.ArtistsGenresDb;
import com.musicLibraryApp.app.repositories.IArtistsGenresRepository;
import org.springframework.stereotype.Service;

@Service
public class ArtistsGenresService implements IArtistsGenresService {
    private final IArtistsGenresRepository artistsGenresRepository;

    public ArtistsGenresService(IArtistsGenresRepository artistsGenresRepository) {
        this.artistsGenresRepository = artistsGenresRepository;
    }

    public void add(int artistId, int genreId){
        ArtistsGenresDb ag = artistsGenresRepository.findByArtistIdAndGenreId(artistId, genreId);
        if (ag == null) {
            artistsGenresRepository.save(new ArtistsGenresDb(artistId, genreId));
        } else {
            ag.setArtistId(artistId);
            ag.setGenreId(genreId);
            artistsGenresRepository.saveAndFlush(ag);
        }
    }

    public void deleteByArtistId(int artistId) {
        artistsGenresRepository.deleteByArtistId(artistId);
    }
}

