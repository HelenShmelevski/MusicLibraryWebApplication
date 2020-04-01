package com.musicLibrary.musicLibraryApplication.Services;

import com.musicLibrary.musicLibraryApplication.Exceptions.ResourceNotFoundException;
import com.musicLibrary.musicLibraryApplication.Models.Track;
import com.musicLibrary.musicLibraryApplication.Repositories.ITrackRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TrackService  {
    private final ITrackRepository trackRepository;

    public TrackService(ITrackRepository genreRepository) {
        this.trackRepository = genreRepository;
    }

    public Track[] getAllTrack() {
        return this.trackRepository.findAll().toArray(new Track[0]);
    }

    public Track[] getAllTrackFromReleasePeriod(Date startDate, Date endDate){
        Track[] all = getAllTrack();
        List<Track> valid = new ArrayList<Track>();
        for (int i = 0; i <all.length ; i++) {
           if (all[i].getDateRelease().getTime() >= startDate.getTime() &&
                    all[i].getDateRelease().getTime() <= endDate.getTime()) {
               valid.add(all[i]);
           }
        }
        return valid.toArray(new Track[0]);
    }

    public Track getTrack(int trackId) {
        Optional<Track> foundTrack = this.trackRepository.findById(trackId);

        if (foundTrack.isPresent()) {
            return foundTrack.get();
        } else {
            throw new ResourceNotFoundException("Record in TRACK table isn't found with id: " + trackId);
        }
    }

    public void addTrack(Track track) {
        this.trackRepository.saveAndFlush(track);
    }
    public void deleteTrack(int trackId) {
        this.trackRepository.deleteById(trackId);
    }

    public void updateTrack(int trackId, Track newTrack) {
        Optional<Track> updatedTrack = this.trackRepository.findById(trackId);

        if (updatedTrack.isPresent()) {
            Track track = updatedTrack.get();
            //track.setTrackId(newTrack.getTrackId());
            track.setTitle(newTrack.getTitle());
            track.setAlbum(newTrack.getAlbum());
            track.setArtist(newTrack.getArtist());
            track.setDateRelease(newTrack.getDateRelease());
            trackRepository.save(track);
        } else {
            throw new ResourceNotFoundException("Record in TRACK table isn't found with id: " + trackId);
        }
    }
}
