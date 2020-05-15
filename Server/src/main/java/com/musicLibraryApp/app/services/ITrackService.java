package com.musicLibraryApp.app.services;

import com.musicLibraryApp.app.dto.Track;

import java.util.Date;
import java.util.List;

public interface ITrackService {
    List<Track> getAllTrack();
    Track getTrack(int trackId);
    List<Track> getAllTrackFromReleasePeriod(Date startDate, Date endDate);
    void addTrack(String title, String album, Date dateRelease, int artistId);
    void deleteTrack(int trackId);
    void updateTrack(int trackId, Track newTrack);
}
