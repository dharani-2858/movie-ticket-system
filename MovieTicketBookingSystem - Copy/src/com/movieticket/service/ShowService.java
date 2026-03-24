package com.movieticket.service;

import com.movieticket.dao.ShowDAO;
import com.movieticket.model.Show;

public class ShowService {

    private ShowDAO showDAO = new ShowDAO();

    public void addShow(int movieId, String showTime, int seats) {
        Show show = new Show(movieId, showTime, seats);
        showDAO.addShow(show);
    }
}