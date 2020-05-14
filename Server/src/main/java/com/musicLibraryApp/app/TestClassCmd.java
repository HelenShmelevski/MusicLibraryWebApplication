//package com.musicLibrary.musicLibraryApplication;
//
//import com.musicLibrary.musicLibraryApplication.dbModels.Genre;
//import com.musicLibrary.musicLibraryApplication.dto.GenreDTO;
//import com.musicLibrary.musicLibraryApplication.services.GenreService;
//import com.musicLibrary.musicLibraryApplication.services.IGenreService;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class TestClassCmd implements CommandLineRunner {
//    private final GenreService genreService;
//
//    public TestClassCmd(GenreService genreService) {
//        this.genreService = genreService;
//    }
//    @Override
//    public void run(String... args) throws Exception {
//        this.genreService.addGenre("Рок");
//    }
//
//    public static void main(String[] args) {
//        SpringApplication.run(TestClassCmd.class, args);
//    }
//}
