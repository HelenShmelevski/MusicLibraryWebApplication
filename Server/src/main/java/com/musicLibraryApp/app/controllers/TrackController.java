package com.musicLibraryApp.app.controllers;

import com.musicLibraryApp.app.dto.Artist;
import com.musicLibraryApp.app.services.TrackService;
import com.musicLibraryApp.app.dto.Track;
import com.musicLibraryApp.app.wrappers.TrackWrapper;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/tracks")
public class TrackController {
    public final TrackService trackService;

    public TrackController(TrackService trackService) {
        this.trackService = trackService;
    }

    @GetMapping("/")
    public List<Track> getAllTrack() {
        return trackService.getAllTrack();
    }

    @PostMapping("/getAllTrackFromReleasePeriod")
    public List<Track> getAllTrackFromReleasePeriod(Date startDate, Date endDate){
        return trackService.getAllTrackFromReleasePeriod(startDate,endDate);
    }

    @GetMapping("/{id}")
    public Track getTrack(@PathVariable int id) {
        return trackService.getTrack(id);
    }

    @PostMapping("/")
    public void addTrack(@RequestBody TrackWrapper wrapper) {
        trackService.addTrack(wrapper.getTitle(), wrapper.getAlbum(), wrapper.getDateRelease(), wrapper.getArtistId());
    }

    @PutMapping("/{id}")
    public void updateTrack(@PathVariable int id, @RequestBody Track newTrack) {
        trackService.updateTrack(id, newTrack);
    }

    @DeleteMapping("/{id}")
    public void deleteTrack(@PathVariable int id) {
        trackService.deleteTrack(id);
    }
}
