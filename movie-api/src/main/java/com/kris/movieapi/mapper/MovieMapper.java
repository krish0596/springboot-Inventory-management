package com.kris.movieapi.mapper;

import com.kris.movieapi.model.Movie;
import com.kris.movieapi.rest.dto.CreateMovieRequest;
import com.kris.movieapi.rest.dto.MovieDto;

public interface MovieMapper {

    Movie toMovie(CreateMovieRequest createMovieRequest);

    MovieDto toMovieDto(Movie movie);
}