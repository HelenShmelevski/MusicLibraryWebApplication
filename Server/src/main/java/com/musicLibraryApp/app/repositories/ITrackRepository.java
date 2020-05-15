package com.musicLibraryApp.app.repositories;

import com.musicLibraryApp.app.dbModels.TrackDb;
import com.musicLibraryApp.app.dto.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ITrackRepository extends JpaRepository<TrackDb, Integer> {
    @Query(value = "SELECT *" +
            " FROM TRACKS track" +
            " JOIN ARTISTS artist" +
            " ON artist.artist_id = track.artist_id" +
            " WHERE track.date_release >= :startDate and track.date_release <= :endDate",
            nativeQuery = true)
    List<TrackDb> getAllTrackFromReleasePeriod(@Param("startDate") Date startDate, @Param("endDate") Date endDate);

    @Modifying
    @Query(value = "DELETE FROM TRACKS track" +
            " WHERE track.track_id = :track_id",
            nativeQuery = true)
    void deleteById(@Param("track_id")int trackId);
}
