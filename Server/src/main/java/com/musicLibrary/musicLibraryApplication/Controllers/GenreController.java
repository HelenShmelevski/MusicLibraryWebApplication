package com.musicLibrary.musicLibraryApplication.Controllers;

import com.musicLibrary.musicLibraryApplication.Models.Genre;
import com.musicLibrary.musicLibraryApplication.Services.GenreService;
import com.musicLibrary.musicLibraryApplication.dto.GenreDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/genres")
public class GenreController {
    public final GenreService genreService;

    public GenreController(GenreService genreService) {
        this.genreService = genreService;
    }

    @GetMapping("/")
    public Genre[] getAllGenre(){
         return genreService.getAllGenre();
    }

    @GetMapping("/{id}")
    public Genre getGenre(@PathVariable int id){
        return genreService.getGenre(id);
    }

    @PostMapping("/")
    public void addGenre(@RequestBody GenreDTO genre){
        Genre newGenre = new Genre(genre);
        genreService.addGenre(newGenre);
    }

    @PutMapping("/{id}")
    public void updateGenre(@PathVariable int id, @RequestBody GenreDTO newGenre){
        genreService.updateGenre(id, new Genre(newGenre));
    }

    @DeleteMapping("/{id}")
    public void deleteGenre(@PathVariable int id){
        genreService.deleteGenre(id);
    }
}