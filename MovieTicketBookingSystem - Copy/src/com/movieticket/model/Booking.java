package com.movieticket.model;

	public class Booking {
	    private int customerId;
	    private int showId;
	    private int seatsBooked;

	    public Booking(int customerId, int showId, int seatsBooked) {
	        this.customerId = customerId;
	        this.showId = showId;
	        this.seatsBooked = seatsBooked;
	    }

	    public int getCustomerId() { return customerId; }
	    public int getShowId() { return showId; }
	    public int getSeatsBooked() { return seatsBooked; }
	}


