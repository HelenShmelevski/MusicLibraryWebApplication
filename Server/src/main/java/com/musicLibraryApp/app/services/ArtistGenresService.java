package com.musicLibraryApp.app.services;

import com.musicLibraryApp.app.dbModels.ArtistsGenresDb;
import com.musicLibraryApp.app.repositories.IArtistsGenresRepository;
import org.springframework.stereotype.Service;

@Service
public class ArtistGenresService {
    private final IArtistsGenresRepository artistsGenresRepository;

    public ArtistGenresService(IArtistsGenresRepository artistsGenresRepository) {
        this.artistsGenresRepository = artistsGenresRepository;
    }

    public ArtistsGenresDb[] getAllAG(){
        return this.artistsGenresRepository.findAll().toArray(new ArtistsGenresDb[0]);
    }
}

