package com.musicLibraryApp.app.controllers;

import com.musicLibraryApp.app.wrappers.GenreWrapper;
import com.musicLibraryApp.app.dbModels.GenreDb;
import com.musicLibraryApp.app.services.GenreService;
import com.musicLibraryApp.app.dto.Genre;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/genres")
public class GenreController {
    public final GenreService genreService;

    public GenreController(GenreService genreService) {
        this.genreService = genreService;
    }

    @GetMapping("/")
    public List<Genre> getAllGenre(){
         return genreService.getAllGenre();
    }

    @GetMapping("/{id}")
    public Genre getGenre(@PathVariable int id){
        return genreService.getGenre(id);
    }

    @PostMapping("/")
    public void addGenre(@RequestBody GenreWrapper title){
        genreService.addGenre(title.getTitle());
    }

    @PutMapping("/{id}")
    public void updateGenre(@PathVariable int id, @RequestBody Genre newGenre){
        genreService.updateGenre(id, newGenre);
    }

    @DeleteMapping("/{id}")
    public void deleteGenre(@PathVariable int id){
        genreService.deleteGenre(id);
    }
}
