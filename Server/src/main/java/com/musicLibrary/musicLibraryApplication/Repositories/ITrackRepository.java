package com.musicLibrary.musicLibraryApplication.Repositories;

import com.musicLibrary.musicLibraryApplication.Models.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITrackRepository extends JpaRepository<Track, Integer> { }
