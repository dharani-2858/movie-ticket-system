package com.movieticket.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BookingDAO {

    public void bookTicket(int customerId, int showId, int seats) {

        try (Connection con = DBConnection.getConnection()) {

            String insert = "INSERT INTO booking(customer_id, show_id, seats_booked) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(insert);

            ps.setInt(1, customerId);
            ps.setInt(2, showId);
            ps.setInt(3, seats);
            ps.executeUpdate();

            String update = "UPDATE show_details SET available_seats = available_seats - ? WHERE show_id = ?";
            PreparedStatement ps2 = con.prepareStatement(update);
            ps2.setInt(1, seats);
            ps2.setInt(2, showId);
            ps2.executeUpdate();

            System.out.println("Ticket Booked Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}