package com.musicLibraryApp.app.services;

import com.musicLibraryApp.app.dbModels.ArtistDb;
import com.musicLibraryApp.app.dto.Artist;
import com.musicLibraryApp.app.dto.ArtistShortInfo;
import com.musicLibraryApp.app.dto.Track;
import com.musicLibraryApp.app.exceptions.ResourceNotFoundException;
import com.musicLibraryApp.app.dbModels.TrackDb;
import com.musicLibraryApp.app.repositories.ITrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TrackService implements ITrackService  {
    private final IArtistService artistService;
    private final ITrackRepository trackRepository;

    @Autowired
    public TrackService(ITrackRepository genreRepository, IArtistService artistService) {
        this.trackRepository = genreRepository;
        this.artistService = artistService;
    }

    @Override
    public List<Track> getAllTrack() {
        return this.trackRepository
                .findAll()
                .stream()
                .map(this::convertToTrack)
                .collect(Collectors.toList());
    }

    @Override
    public List<Track> getAllTrackFromReleasePeriod(Date startDate, Date endDate){
        return this.trackRepository
                .getAllTrackFromReleasePeriod(startDate, endDate)
                .stream()
                .map(this::convertToTrack)
                .collect(Collectors.toList());
    }



    @Override
    public Track getTrack(int trackId) {
        return this.trackRepository
                .findById(trackId)
                .map(this::convertToTrack)
                .<ResourceNotFoundException>orElseThrow(() -> {
                    throw new ResourceNotFoundException("Record in TRACK table isn't found with id: " + trackId);
                });
    }

    @Override
    public void addTrack(String title, String album, Date dateRelease, int artistId) {
        // TODO: Сделать, что если не нашли данного артиста кидать ошибку, трек не добавлять
        Artist artist = artistService.getArtist(artistId);
        TrackDb newTrack = new TrackDb(title, album, dateRelease, new ArtistDb(artist));
        this.trackRepository.saveAndFlush(newTrack);
    }

    @Override
    public void deleteTrack(int trackId) {
        // TODO: Сделать, что если нет данного трека в базе, то бросать ошибку
        this.trackRepository.deleteById(trackId);
    }

    @Override
    public void updateTrack(int trackId, Track newTrack) throws ResourceNotFoundException {
            this.trackRepository
                    .findById(trackId)
                    .map(trackDb -> {
                        trackDb.setTitle(newTrack.getTitle());
                        trackDb.setAlbum(newTrack.getAlbum());
                        Artist artist = artistService.getArtist(newTrack.getArtist().getId());
                        trackDb.setArtist(new ArtistDb(artist));
                        trackDb.setDateRelease(newTrack.getDateRelease());
                        return trackRepository.save(trackDb);
                    }).<ResourceNotFoundException>orElseThrow(() -> {
                throw new ResourceNotFoundException("Record in TRACK table isn't found with id: " + trackId);
            });
    }

    private Track convertToTrack(TrackDb trackDb) {
        ArtistDb artistDb = trackDb.getArtist();
        ArtistShortInfo artistShortInfo = new ArtistShortInfo(artistDb.getArtistId(), artistDb.getName(), artistDb.getCountry());
        return new Track(trackDb.getTrackId(), trackDb.getTitle(), trackDb.getAlbum(), trackDb.getDateRelease(), artistShortInfo);
    }
}
