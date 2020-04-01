package com.musicLibrary.musicLibraryApplication.Repositories;

import com.musicLibrary.musicLibraryApplication.Models.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGenreRepository extends JpaRepository<Genre, Integer> { }
