package com.wipro.relationdemo.service;

import com.wipro.relationdemo.entity.Movie;
import java.util.List;

public interface MovieService {
    Movie saveMovie(Movie movie);
    List<Movie> getAllMovies();
}
