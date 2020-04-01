package com.musicLibrary.musicLibraryApplication.Services;

import com.musicLibrary.musicLibraryApplication.Exceptions.ResourceNotFoundException;
import com.musicLibrary.musicLibraryApplication.Models.Genre;
import com.musicLibrary.musicLibraryApplication.Repositories.IGenreRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GenreService implements IGenreService {
    private final IGenreRepository genreRepository;

    public GenreService(IGenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

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
        this.genreRepository.saveAndFlush(genre);
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
            //genre.setGenreId(newGenre.getGenreId());
            genre.setTitle(newGenre.getTitle());
            genreRepository.save(genre);
        } else {
            throw new ResourceNotFoundException("Record in GENRE table isn't found with id: " + genreId);
        }
    }
}
