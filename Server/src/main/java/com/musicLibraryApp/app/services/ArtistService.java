package com.musicLibraryApp.app.services;

import com.musicLibraryApp.app.dbModels.TrackDb;
import com.musicLibraryApp.app.dto.Artist;
import com.musicLibraryApp.app.dto.ArtistShortInfo;
import com.musicLibraryApp.app.dto.Genre;
import com.musicLibraryApp.app.dto.Track;
import com.musicLibraryApp.app.exceptions.ResourceNotFoundException;
import com.musicLibraryApp.app.dbModels.ArtistDb;
import com.musicLibraryApp.app.dbModels.ArtistsGenresDb;
import com.musicLibraryApp.app.repositories.IArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArtistService implements IArtistService  {
    private final IArtistRepository artistRepository;

    @Autowired
    public ArtistService(IArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @Override
    public List<Artist> getAllArtists() {
        return this.artistRepository
                .findAll()
                .stream()
                .map(this::convertToArtist)
                .collect(Collectors.toList());
    }

    @Override
    public Artist getArtist(int artistId) {
        return this.artistRepository
                .findById(artistId)
                .map(this::convertToArtist)
                .<ResourceNotFoundException>orElseThrow(() -> {
                    throw new ResourceNotFoundException("Record in ARTIST table isn't found with id: " + artistId);
                });
    }

    @Override
    public List<Artist> getArtistsByGenre(int genreId){
        return artistRepository.getArtistsByGenre(genreId)
                .stream()
                .map(this::convertToArtist)
                .collect(Collectors.toList());
    }

    @Override
    public void addArtist(String name, String country, List<Track> tracks) {
        ArtistDb artistDb = new ArtistDb(name, country, tracks.stream().map(TrackDb::new).collect(Collectors.toList()));
        this.artistRepository.saveAndFlush(artistDb);
    }

    @Override
    public void deleteArtist(int artistId) {
        this.artistRepository.deleteById(artistId);
    }

    @Override
    public void updateArtist(int artistId, Artist newArtist) {
        this.artistRepository
                .findById(artistId)
                .map(artistDb -> {
                    artistDb.setName(newArtist.getName());
                    artistDb.setCountry(newArtist.getCountry());
                    artistDb.setTracks(newArtist
                            .getTracks()
                            .stream()
                            .map(TrackDb::new)
                            .collect(Collectors.toList()));
                    return artistRepository.save(artistDb);
                })
                .<ResourceNotFoundException>orElseThrow(()->{
                    throw new ResourceNotFoundException("Record in ARTIST table isn't found with id: " + artistId);
                });
    }

    private Artist convertToArtist(ArtistDb artistDb) {
        List<Track> trackList = artistDb
                .getTracks()
                .stream()
                .map(trackDb -> new Track(
                        trackDb.getTrackId(),
                        trackDb.getTitle(),
                        trackDb.getAlbum(),
                        trackDb.getDateRelease(),
                        new ArtistShortInfo(
                                trackDb.getArtist().getArtistId(),
                                trackDb.getArtist().getName(),
                                trackDb.getArtist().getCountry())))
                .collect(Collectors.toList());
        return new Artist(artistDb.getArtistId(), artistDb.getName(), artistDb.getCountry(), trackList);
    }
}