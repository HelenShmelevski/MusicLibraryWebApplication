package com.musicLibraryApp.app.repositories;

import com.musicLibraryApp.app.dbModels.GenreDb;
import com.musicLibraryApp.app.dto.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IGenreRepository extends JpaRepository<GenreDb, Integer> {
    @Query(value="SELECT *" +
            " FROM GENRES genre" +
            " JOIN ARTISTS_GENRES ag" +
            " ON genre.genre_id = ag.genre_id" +
            " JOIN ARTISTS artist" +
            " ON artist.artist_id = :artist_id", nativeQuery = true)
    GenreDb getGenreByArtist(@Param("artist_id") int id);
}
