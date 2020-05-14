package com.musicLibraryApp.app.repositories;

import com.musicLibraryApp.app.dbModels.GenreDb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGenreRepository extends JpaRepository<GenreDb, Integer> { }
