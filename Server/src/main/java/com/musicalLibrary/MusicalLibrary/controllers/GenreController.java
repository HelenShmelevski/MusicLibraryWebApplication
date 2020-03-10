package com.musicalLibrary.MusicalLibrary.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GenreController {
    @GetMapping("/genres")
    public ResponseEntity<String[]> getAllGenre(){
//        return ResponseEntity.ok().body(genreService.getAllGenre());
        return ResponseEntity.ok().body(new String[] {"1", "2", "3"});
    }

//    @GetMapping("/genres/{id}")
//    public ResponseEntity<Genre> getGenre(@PathVariable int genreId){
//        return ResponseEntity.ok().body(genreService.getGenre(genreId));
//    }
//
//    @PostMapping("/genres")
//    public ResponseEntity<?> addGenre(@RequestBody Genre genre){
//        genreService.addGenre(genre);
//        return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.OK);
//    }
//
//    @PutMapping("/genres/{id}")
//    public ResponseEntity<?> updateGenre(@PathVariable int genreId, @RequestBody Genre newGenre){
//        genreService.updateGenre(genreId, newGenre);
//        return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.OK);
//    }
//
//    @DeleteMapping("/genres/{id}")
//    public ResponseEntity<?> updateGenre(@PathVariable int genreId){
//        genreService.deleteGenre(genreId);
//        return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.OK);
//    }
}
