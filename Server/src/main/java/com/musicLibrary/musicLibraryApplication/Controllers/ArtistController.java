package com.musicLibrary.musicLibraryApplication.Controllers;

import com.musicLibrary.musicLibraryApplication.Models.Artist;
import com.musicLibrary.musicLibraryApplication.Models.Genre;
import com.musicLibrary.musicLibraryApplication.Services.ArtistService;
import com.musicLibrary.musicLibraryApplication.dto.ArtistDTO;
import com.musicLibrary.musicLibraryApplication.dto.GenreDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/artists")
public class ArtistController {
    public final ArtistService artistService;

    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @GetMapping("/")
    public Artist[] getAllArtists() {
        return artistService.getAllArtists();
    }

    @GetMapping("/{id}")
    public Artist getArtist(@PathVariable int id) {
        return artistService.getArtist(id);
    }

    @PostMapping("/getArtistsByGenre")
    public Artist[] getArtistsByGenre(@RequestBody GenreDTO genre){
        Genre g = new Genre(genre);
        return artistService.getArtistsByGenre(g);
    }

    @PostMapping("/")
    public void addArtist(@RequestBody ArtistDTO artist) {
        Artist newArtist = new Artist(artist);
        artistService.addArtist(newArtist);
    }

    @PutMapping("/{id}")
    public void updateArtist(@PathVariable int id, @RequestBody ArtistDTO newArtist) {
        artistService.updateArtist(id, new Artist(newArtist));
    }

    @DeleteMapping("/{id}")
    public void deleteArtist(@PathVariable int id) {
        artistService.deleteArtist(id);
    }
}
