package com.musicLibrary.musicLibraryApplication.Services;

import com.musicLibrary.musicLibraryApplication.Exceptions.ResourceNotFoundException;
import com.musicLibrary.musicLibraryApplication.Models.Artist;
import com.musicLibrary.musicLibraryApplication.Models.ArtistsGenres;
import com.musicLibrary.musicLibraryApplication.Models.Genre;
import com.musicLibrary.musicLibraryApplication.Repositories.IArtistRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ArtistService  {
    private final IArtistRepository artistRepository;
    private final ArtistGenresService artistGenresService;

    public ArtistService(IArtistRepository artistRepository, ArtistGenresService artistsGenresService) {
        this.artistRepository = artistRepository;
        this.artistGenresService = artistsGenresService;
    }

    public Artist[] getAllArtists() {
        return this.artistRepository.findAll().toArray(new Artist[0]);
    }

    public Artist getArtist(int artistId) {
        Optional<Artist> foundArtist = this.artistRepository.findById(artistId);
        if (foundArtist.isPresent()) {
            return foundArtist.get();
        } else {
            throw new ResourceNotFoundException("Record in ARTIST table isn't found with id: " + artistId);
        }
    }

    public Artist[] getArtistsByGenre(Genre genre){
        ArtistsGenres[] allAG = artistGenresService.getAllAG();
        List<ArtistsGenres> allAGByGenre = new ArrayList<ArtistsGenres>();
        for (int i = 0; i <allAG.length ; i++) {
            if(allAG[i].getGenreId()==genre.getGenreId()){
                allAGByGenre.add(allAG[i]);
            }
        }
        List<Artist> ArtistsByGenre = new ArrayList<Artist>();
        for (int i = 0; i < allAGByGenre.size(); i++) {
           ArtistsByGenre.add(getArtist(allAGByGenre.get(i).getArtistId()));
        }
        return ArtistsByGenre.toArray(new Artist[0]);
    }

    public void addArtist(Artist artist) {
        this.artistRepository.saveAndFlush(artist);
    }

    public void deleteArtist(int artistId) {
        this.artistRepository.deleteById(artistId);
    }

    public void updateArtist(int artistId, Artist newArtist) {
        Optional<Artist> updatedArtist = this.artistRepository.findById(artistId);
        if (updatedArtist.isPresent()) {
            Artist artist = updatedArtist.get();
            //artist.setArtistId(newArtist.getArtistId());
            artist.setName(newArtist.getName());
            artist.setCountry(newArtist.getCountry());
            artistRepository.save(artist);
        } else {
            throw new ResourceNotFoundException("Record in ARTIST table isn't found with id: " + artistId);
        }
    }
}
