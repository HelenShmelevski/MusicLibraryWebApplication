package com.musicLibraryApp.app.controllers;

import com.musicLibraryApp.app.dto.Artist;
import com.musicLibraryApp.app.dto.Genre;
import com.musicLibraryApp.app.dto.Track;
import com.musicLibraryApp.app.services.IArtistService;
import com.musicLibraryApp.app.wrappers.ArtistWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/artists")
public class ArtistController {
    public final IArtistService artistService;

    @Autowired
    public ArtistController(IArtistService artistService) {
        this.artistService = artistService;
    }

    @GetMapping("/")
    public List<Artist> getAllArtists() {
        return artistService.getAllArtists();
    }

    @GetMapping("/{id}")
    public Artist getArtist(@PathVariable int id) {
        return artistService.getArtist(id);
    }

    @PostMapping("/getArtistsByGenre")
    public List<Artist> getArtistsByGenre(@RequestBody Genre genre){
        return artistService.getArtistsByGenre(genre);
    }

    @PostMapping("/")
    public void addArtist(@RequestBody ArtistWrapper artist) {
        artistService.addArtist(artist.getName(), artist.getCountry(), artist.getTracks());
    }

    @PutMapping("/{id}")
    public void updateArtist(@PathVariable int id, @RequestBody Artist newArtist) {
        artistService.updateArtist(id, newArtist);
    }

    @DeleteMapping("/{id}")
    public void deleteArtist(@PathVariable int id) {
        artistService.deleteArtist(id);
    }
}
