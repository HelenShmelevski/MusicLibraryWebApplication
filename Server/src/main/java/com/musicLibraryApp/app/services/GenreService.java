package com.musicLibraryApp.app.services;

import com.musicLibraryApp.app.dto.Genre;
import com.musicLibraryApp.app.exceptions.ResourceNotFoundException;
import com.musicLibraryApp.app.dbModels.GenreDb;
import com.musicLibraryApp.app.repositories.IGenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GenreService implements IGenreService {
    private final IGenreRepository genreRepository;

    @Autowired
    public GenreService(IGenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    @Override
    public List<Genre> getAllGenre() {
        return this.genreRepository
                .findAll()
                .stream()
                .map(this::convertToGenre)
                .collect(Collectors.toList());
    }

    @Override
    public Genre getGenre(int genreId) {
        return this.genreRepository
                .findById(genreId)
                .map(this::convertToGenre)
                .<ResourceNotFoundException>orElseThrow(() -> {
                    throw new ResourceNotFoundException("Record in GENRE table isn't found with id: " + genreId);
                });
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
    public void updateGenre(int genreId, Genre newGenre) {
        this.genreRepository
                .findById(genreId)
                .map(genreDb -> {
                    genreDb.setTitle(newGenre.getTitle());
                    return genreRepository.save(genreDb);
                }).<ResourceNotFoundException>orElseThrow(()-> {
                    throw new ResourceNotFoundException("Record in GENRE table isn't found with id: " + genreId);
                });
    }

    @Override
    public Genre getGenreByArtist(int id) {
        try {
            GenreDb genreDb = this.genreRepository.getGenreByArtist(id);
            Genre genre = convertToGenre(genreDb);
            return genre;
        } catch (Exception e) {
            return null;
        }
    }

    private Genre convertToGenre(GenreDb genreDb) {
        return new Genre(genreDb.getGenreId(), genreDb.getTitle());
    }
}
