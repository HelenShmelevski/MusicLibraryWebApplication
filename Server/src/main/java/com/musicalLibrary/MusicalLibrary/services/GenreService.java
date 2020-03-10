package com.musicalLibrary.MusicalLibrary.services;

import com.musicalLibrary.MusicalLibrary.execeptions.ResourceNotFoundException;
import com.musicalLibrary.MusicalLibrary.models.Genre;
import com.musicalLibrary.MusicalLibrary.repositories.genre.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class GenreService implements IGenreService {
    @Autowired
    private GenreRepository genreRepository;

    @Override
    public Genre[] getAllGenre() {
        return this.genreRepository.findAll().toArray(new Genre[0]);
    }

    @Override
    public Genre getGenre(int genreId) {
        Optional<Genre> foundGenre = this.genreRepository.findById(genreId);

        if (foundGenre.isPresent()) {
            return foundGenre.get();
        } else {
            throw new ResourceNotFoundException("Record in GENRE table isn't found with id: " + genreId);
        }
    }

    @Override
    public void addGenre(Genre genre) {
        this.genreRepository.save(genre);
    }

    @Override
    public void deleteGenre(int genreId) {
        this.genreRepository.deleteById(genreId);
    }

    @Override
    public void updateGenre(int genreId, Genre newGenre) {
        Optional<Genre> updatedGenre = this.genreRepository.findById(genreId);

        if (updatedGenre.isPresent()) {
            Genre genre = updatedGenre.get();
            genre.setGenreId(newGenre.getGenreId());
            genre.setTitle(newGenre.getTitle());
            genreRepository.save(genre);
        } else {
            throw new ResourceNotFoundException("Record in GENRE table isn't found with id: " + genreId);
        }
    }
}
