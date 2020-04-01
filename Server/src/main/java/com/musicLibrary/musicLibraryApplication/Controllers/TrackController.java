package com.musicLibrary.musicLibraryApplication.Controllers;

import com.musicLibrary.musicLibraryApplication.Models.Track;
import com.musicLibrary.musicLibraryApplication.Services.TrackService;
import com.musicLibrary.musicLibraryApplication.dto.TrackDTO;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/tracks")
public class TrackController {
    public final TrackService trackService;

    public TrackController(TrackService trackService) {
        this.trackService = trackService;
    }

    @GetMapping("/")
    public Track[] getAllTrack() {
        return trackService.getAllTrack();
    }

    @PostMapping("/getAllTrackFromReleasePeriod")
    public Track[] getAllTrackFromReleasePeriod(Date startDate, Date endDate){
        return trackService.getAllTrackFromReleasePeriod(startDate,endDate);
    }

    @GetMapping("/{id}")
    public Track getTrack(@PathVariable int id) {
        return trackService.getTrack(id);
    }

    @PostMapping("/")
    public void addGenre(@RequestBody TrackDTO track) {
        Track newTrack = new Track(track);
        trackService.addTrack(newTrack);
    }

    @PutMapping("/{id}")
    public void updateTrack(@PathVariable int id, @RequestBody TrackDTO newTrack) {
        trackService.updateTrack(id, new Track(newTrack));
    }

    @DeleteMapping("/{id}")
    public void deleteTrack(@PathVariable int id) {
        trackService.deleteTrack(id);
    }
}
