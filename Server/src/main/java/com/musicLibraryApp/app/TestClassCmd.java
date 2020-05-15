package com.musicLibraryApp.app;

import com.musicLibraryApp.app.dto.Artist;
import com.musicLibraryApp.app.dto.Track;
import com.musicLibraryApp.app.services.IArtistService;
import com.musicLibraryApp.app.services.IGenreService;
import com.musicLibraryApp.app.services.ITrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.List;

@SpringBootApplication
public class TestClassCmd implements CommandLineRunner {
    private final IGenreService genreService;
    private final ITrackService trackService;
    private final IArtistService artistService;

    @Autowired
    public TestClassCmd(IGenreService genreService, ITrackService trackService, IArtistService artistService) {
        this.genreService = genreService;
        this.trackService = trackService;
        this.artistService = artistService;
    }
    @Override
    public void run(String... args) throws Exception {
        trackService.deleteTrack(1);

    }

    public static void main(String[] args) {
        SpringApplication.run(TestClassCmd.class, args);
    }
}
