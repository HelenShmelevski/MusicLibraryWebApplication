package com.musicLibrary.musicLibraryApplication.Repositories;

import com.musicLibrary.musicLibraryApplication.Models.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IArtistRepository extends JpaRepository<Artist, Integer> { }
