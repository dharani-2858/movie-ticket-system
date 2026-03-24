package com.movieticket.dao;
import com.movieticket.model.Movie;
import java.sql.Connection;
import java.sql.PreparedStatement;

	public class MovieDAO {

	    public void addMovie(Movie movie) {
	        try (Connection con = DBConnection.getConnection()) {

	            String sql = "INSERT INTO movie(title, language, duration) VALUES (?, ?, ?)";
	            PreparedStatement ps = con.prepareStatement(sql);

	            ps.setString(1, movie.getTitle());
	            ps.setString(2, movie.getLanguage());
	            ps.setInt(3, movie.getDuration());

	            ps.executeUpdate();
	            System.out.println("Movie Added Successfully!");

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}


