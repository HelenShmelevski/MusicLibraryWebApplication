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

    public List<Track> getAllTrack() {
        return this.trackRepository
                .findAll()
                .stream()
                .map(trackDb-> {
                    ArtistDb artistDb = trackDb.getArtist();
                    ArtistShortInfo artistShortInfo = new ArtistShortInfo(artistDb.getArtistId(), artistDb.getName(), artistDb.getName());
                    return new Track(trackDb.getTrackId(), trackDb.getTitle(), trackDb.getAlbum(), trackDb.getDateRelease(), artistShortInfo);
                })
                .collect(Collectors.toList());
    }

    public List<Track> getAllTrackFromReleasePeriod(Date startDate, Date endDate){
        // TODO: Забирать query запросом из бд данные треки
        List<Track> trackList = getAllTrack();
        return trackList
                .stream()
                .filter(track -> track.getDateRelease().getTime() >= startDate.getTime()
                        && track.getDateRelease().getTime() <= endDate.getTime())
                .collect(Collectors.toList());
    }

    public Track getTrack(int trackId) throws ResourceNotFoundException {
        return this.trackRepository
                .findById(trackId)
                .map(trackDb-> {
                    ArtistDb artistDb = trackDb.getArtist();
                    ArtistShortInfo artistShortInfo = new ArtistShortInfo(artistDb.getArtistId(), artistDb.getName(), artistDb.getName());
                    return new Track(trackDb.getTrackId(), trackDb.getTitle(), trackDb.getAlbum(), trackDb.getDateRelease(), artistShortInfo);
                })
                .<ResourceNotFoundException>orElseThrow(() -> {
                    throw new ResourceNotFoundException("Record in TRACK table isn't found with id: " + trackId);
                });
    }

    public void addTrack(String title, String album, Date dateRelease, int artistId) {
        // TODO: Сделать, что если не нашли данного артиста кидать ошибку, трек не добавлять
        Artist artist = artistService.getArtist(artistId);
        TrackDb newTrack = new TrackDb(title, album, dateRelease, new ArtistDb(artist));
        this.trackRepository.saveAndFlush(newTrack);
    }
    public void deleteTrack(int trackId) {
        // TODO: Сделать, что если нет данного трека в базе, то бросать ошибку
        this.trackRepository.deleteById(trackId);
    }

    public void updateTrack(int trackId, Track newTrack) throws ResourceNotFoundException {
            this.trackRepository
                    .findById(trackId)
                    .map(trackDb -> {
                        trackDb.setTitle(newTrack.getTitle());
                        trackDb.setAlbum(newTrack.getAlbum());
                        Artist artist = artistService.getArtist(newTrack.getArtist().getArtistId());
                        trackDb.setArtist(new ArtistDb(artist));
                        trackDb.setDateRelease(newTrack.getDateRelease());
                        return trackRepository.save(trackDb);
                    }).<ResourceNotFoundException>orElseThrow(() -> {
                throw new ResourceNotFoundException("Record in TRACK table isn't found with id: " + trackId);
            });
    }
}
