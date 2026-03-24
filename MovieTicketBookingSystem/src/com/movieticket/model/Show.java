package com.movieticket.model;

	public class Show {
	    private int showId;
	    private int movieId;
	    private String showTime;
	    private int availableSeats;

	    public Show(int movieId, String showTime, int availableSeats) {
	        this.movieId = movieId;
	        this.showTime = showTime;
	        this.availableSeats = availableSeats;
	    }

	    public int getMovieId() { return movieId; }
	    public String getShowTime() { return showTime; }
	    public int getAvailableSeats() { return availableSeats; }
	}


