/*
 * Full Name: MUNYAWERA Anaclet
 * Registration Number: 25RP00508
 * Class: Y2 IT A
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tickets.app;

/**
 *
 * @author munya
 */
import com.tickets.users.RegularUser;
import com.tickets.tickettypes.StandardTicket;
import com.tickets.tickettypes.VIPTicket;
import com.tickets.tickettypes.Ticket;

public class DemoApp {

    public static void main(String[] args) {

        // STUDENT OWNERSHIP INFORMATION
        System.out.println("       UNITY TICKET SYSTEM");
        System.out.println("================================");
        System.out.println("Student Information:");
        System.out.println("Student 1: MUNYAWERA Anaclet");
        System.out.println("Registration: [25RP00508]");
        System.out.println("Class: Y2 IT A");
        System.out.println("================================");

        // CREATE CUSTOMERS
        RegularUser nina = new RegularUser("Nina");
        RegularUser lucas = new RegularUser("Lucas");

        // DISPLAY CUSTOMERS
        nina.displayUser();
        lucas.displayUser();

        // NINA BUYS STANDARD TICKET
        System.out.println("\n--- NINA'S PURCHASE ---");

        StandardTicket ticket1 =
                new StandardTicket("Nina", 10.0, "A1");

        ticket1.buyTicket(10.0);

        // LUCAS BUYS VIP TICKET
        System.out.println("\n--- LUCAS'S PURCHASE ---");

        VIPTicket ticket2 =
                new VIPTicket("Lucas", 10.0, "B2");

        ticket2.buyTicket(10.0, "B2");

        // DISPLAY ALL PURCHASED TICKETS
        System.out.println("\n===== ALL PURCHASED TICKETS =====");

        Ticket.showAllTickets();

        // DISPLAY TOTAL REVENUE
        double totalRevenue =
                ticket1.calculateFinalPrice()
                + ticket2.calculateFinalPrice();

        System.out.println("\nTotal Tickets Sold: "
                + Ticket.totalTickets);

        System.out.println("Total Revenue: $"
                + totalRevenue);
    }
}

