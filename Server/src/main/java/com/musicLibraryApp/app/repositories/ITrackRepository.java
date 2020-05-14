package com.musicLibraryApp.app.repositories;

import com.musicLibraryApp.app.dbModels.TrackDb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITrackRepository extends JpaRepository<TrackDb, Integer> { }
