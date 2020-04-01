package com.musicLibrary.musicLibraryApplication.Services;

import com.musicLibrary.musicLibraryApplication.Exceptions.ResourceNotFoundException;
import com.musicLibrary.musicLibraryApplication.Models.Artist;
import com.musicLibrary.musicLibraryApplication.Models.ArtistsGenres;
import com.musicLibrary.musicLibraryApplication.Repositories.IArtistRepository;
import com.musicLibrary.musicLibraryApplication.Repositories.IArtistsGenresRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ArtistGenresService {
    private final IArtistsGenresRepository artistsGenresRepository;

    public ArtistGenresService(IArtistsGenresRepository artistsGenresRepository) {
        this.artistsGenresRepository = artistsGenresRepository;
    }

    public ArtistsGenres[] getAllAG(){
        return this.artistsGenresRepository.findAll().toArray(new ArtistsGenres[0]);
    }
}

