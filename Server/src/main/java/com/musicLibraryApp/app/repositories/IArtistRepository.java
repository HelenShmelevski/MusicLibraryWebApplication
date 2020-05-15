package com.musicLibraryApp.app.repositories;

import com.musicLibraryApp.app.dbModels.ArtistDb;
import com.musicLibraryApp.app.dto.Artist;
import com.musicLibraryApp.app.dto.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface IArtistRepository extends JpaRepository<ArtistDb, Integer> {

    @Query(value = "SELECT *" +
            " FROM ARTISTS artist" +
            " JOIN ARTISTS_GENRES ag" +
            " ON artist.artist_id = ag.artist_id" +
            " JOIN GENRES genre" +
            " ON genre.genre_id = :genre_id", nativeQuery = true)
    List<ArtistDb> getArtistsByGenre(@Param("genre_id") int genreId);
}
