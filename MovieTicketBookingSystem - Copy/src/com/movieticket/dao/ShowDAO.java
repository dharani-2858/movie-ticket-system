package com.movieticket.dao;
import com.movieticket.model.Show;
import java.sql.Connection;
import java.sql.PreparedStatement;

	public class ShowDAO {

	    public void addShow(Show show) {
	        try (Connection con = DBConnection.getConnection()) {

	            String sql = "INSERT INTO show_details(movie_id, show_time, available_seats) VALUES (?, ?, ?)";
	            PreparedStatement ps = con.prepareStatement(sql);

	            ps.setInt(1, show.getMovieId());
	            ps.setString(2, show.getShowTime());
	            ps.setInt(3, show.getAvailableSeats());

	            ps.executeUpdate();
	            System.out.println("Show Added Successfully!");

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}


