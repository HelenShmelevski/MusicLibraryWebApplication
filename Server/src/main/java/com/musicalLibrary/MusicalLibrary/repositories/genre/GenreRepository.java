package com.musicalLibrary.MusicalLibrary.repositories.genre;

import com.musicalLibrary.MusicalLibrary.models.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Integer> { }
