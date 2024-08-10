package com.kris.movieapi.service;

import java.util.List;

import com.kris.movieapi.model.Movie;

public interface MovieService {

    List<Movie> getMovies();

    List<Movie> getMoviesContainingText(String text);

    Movie validateAndGetMovie(String imdb);

    Movie saveMovie(Movie movie);

    void deleteMovie(Movie movie);
}
