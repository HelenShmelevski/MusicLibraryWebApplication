package com.musicLibraryApp.app.repositories;

import com.musicLibraryApp.app.dbModels.ArtistsGenresDb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IArtistsGenresRepository extends JpaRepository<ArtistsGenresDb, Integer> {

}
