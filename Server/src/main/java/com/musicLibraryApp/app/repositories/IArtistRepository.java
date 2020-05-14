package com.musicLibraryApp.app.repositories;

import com.musicLibraryApp.app.dbModels.ArtistDb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IArtistRepository extends JpaRepository<ArtistDb, Integer> {
}
