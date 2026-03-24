package com.movieticket.ui;

import com.movieticket.service.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MovieService movieService = new MovieService();
        ShowService showService = new ShowService();
        CustomerService customerService = new CustomerService();
        BookingService bookingService = new BookingService();

        while (true) {

            System.out.println("\n===== Movie Ticket Booking System =====");
            System.out.println("1. Add Movie");
            System.out.println("2. Add Show");
            System.out.println("3. Register Customer");
            System.out.println("4. Book Ticket");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Language: ");
                    String lang = sc.nextLine();
                    System.out.print("Duration: ");
                    int dur = sc.nextInt();
                    movieService.addMovie(title, lang, dur);
                    break;

                case 2:
                    System.out.print("Movie ID: ");
                    int mid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Show Time: ");
                    String time = sc.nextLine();
                    System.out.print("Available Seats: ");
                    int seats = sc.nextInt();
                    showService.addShow(mid, time, seats);
                    break;

                case 3:
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Phone: ");
                    String phone = sc.nextLine();
                    customerService.registerCustomer(name, phone);
                    break;

                case 4:
                    System.out.print("Customer ID: ");
                    int cid = sc.nextInt();
                    System.out.print("Show ID: ");
                    int sid = sc.nextInt();
                    System.out.print("Seats: ");
                    int s = sc.nextInt();
                    bookingService.bookTicket(cid, sid, s);
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}