package com.musicLibraryApp.app.services;

import com.musicLibraryApp.app.exceptions.ResourceNotFoundException;
import com.musicLibraryApp.app.dbModels.GenreDb;
import com.musicLibraryApp.app.repositories.IGenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GenreService implements IGenreService {
    private final IGenreRepository genreRepository;

    @Autowired
    public GenreService(IGenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    @Override
    public GenreDb[] getAllGenre() {
        return this.genreRepository.findAll().toArray(new GenreDb[0]);
    }

    @Override
    public GenreDb getGenre(int genreId) {
        Optional<GenreDb> foundGenre = this.genreRepository.findById(genreId);

        if (foundGenre.isPresent()) {
            return foundGenre.get();
        } else {
            throw new ResourceNotFoundException("Record in GENRE table isn't found with id: " + genreId);
        }
    }

    @Override
    public void addGenre(String title) {
        GenreDb newGenre = new GenreDb(title);
        this.genreRepository.saveAndFlush(newGenre);
    }

    @Override
    public void deleteGenre(int genreId) {
        this.genreRepository.deleteById(genreId);
    }

    @Override
    public void updateGenre(int genreId, GenreDb newGenre) {
        Optional<GenreDb> updatedGenre = this.genreRepository.findById(genreId);

        if (updatedGenre.isPresent()) {
            GenreDb genre = updatedGenre.get();
            genre.setTitle(newGenre.getTitle());
            genreRepository.save(genre);
        } else {
            throw new ResourceNotFoundException("Record in GENRE table isn't found with id: " + genreId);
        }
    }
}
