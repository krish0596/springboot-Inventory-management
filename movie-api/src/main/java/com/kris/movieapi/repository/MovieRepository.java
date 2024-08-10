package com.kris.movieapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kris.movieapi.model.Movie;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, String> {

    List<Movie> findAllByOrderByTitle();

    List<Movie> findByImdbContainingOrTitleContainingIgnoreCaseOrderByTitle(String imdb, String title);
}
