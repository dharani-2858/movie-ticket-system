package com.movieticket.service;
import com.movieticket.dao.BookingDAO;

	public class BookingService {

	    private BookingDAO bookingDAO = new BookingDAO();

	    public void bookTicket(int customerId, int showId, int seats) {
	        bookingDAO.bookTicket(customerId, showId, seats);
	    }
	}


