package com.example.movieapi.service;

import com.example.movieapi.model.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    private final List<Movie> movies = new ArrayList<>();

    public Movie addMovie(Movie movie) {
        movies.add(movie);
        return movie;
    }

    public Movie getMovieById(int id) {
        return movies.stream()
                .filter(movie -> movie.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Movie> getAllMovies() {
        return movies;
    }
}
