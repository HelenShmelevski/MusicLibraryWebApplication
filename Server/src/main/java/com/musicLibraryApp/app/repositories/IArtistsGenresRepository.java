package com.musicLibraryApp.app.repositories;

import com.musicLibraryApp.app.dbModels.ArtistsGenresDb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IArtistsGenresRepository extends JpaRepository<ArtistsGenresDb, Integer> {
    @Query(value = "SELECT *" +
            " FROM ARTISTS_GENRES ag" +
            " WHERE ag.ARTIST_ID = :artist_Id AND ag.GENRE_ID = :genre_Id",
            nativeQuery = true)
    default ArtistsGenresDb findByArtistIdAndGenreId(@Param("artist_Id") int artistId, @Param("genre_Id") int genreId) {
        return null;
    }

    @Query(value = "DELETE" +
            " FROM ARTISTS_GENRES ag" +
            " WHERE ag.ARTIST_ID = :artist_id",
            nativeQuery = true)
    void deleteByArtistId(@Param("artist_id") int artistId);
}