package com.movieticket.service;

import com.movieticket.dao.MovieDAO;
import com.movieticket.model.Movie;

public class MovieService {

    private MovieDAO movieDAO = new MovieDAO();

    public void addMovie(String title, String language, int duration) {
        Movie movie = new Movie(title, language, duration);
        movieDAO.addMovie(movie);
    }
}