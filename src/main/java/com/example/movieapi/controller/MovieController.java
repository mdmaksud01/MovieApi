package com.example.movieapi.controller;

import com.example.movieapi.model.Movie;
import com.example.movieapi.service.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    // ✅ ADD MOVIE
    @PostMapping("/add")
    public ResponseEntity<?> addMovie(@RequestBody Movie movie) {

        if (movie.getName() == null || movie.getName().isEmpty()) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("Movie name is required");
        }

        if (movie.getDescription() == null || movie.getDescription().isEmpty()) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("Movie description is required");
        }

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(movieService.addMovie(movie));
    }

    // ✅ GET MOVIE BY ID
    @GetMapping("/get/{id}")
    public ResponseEntity<?> getMovieById(@PathVariable int id) {

        Movie movie = movieService.getMovieById(id);

        if (movie == null) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Movie not found");
        }

        return ResponseEntity.ok(movie);
    }

    // ✅ GET ALL MOVIES
    @GetMapping("/all")
    public ResponseEntity<List<Movie>> getAllMovies() {
        return ResponseEntity.ok(movieService.getAllMovies());
    }
}
