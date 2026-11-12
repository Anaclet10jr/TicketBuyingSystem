/*
 * Full Name: MUNYAWERA Anaclet
 * Registration Number: 25RP00508
 * Class: Y2 IT A
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tickets.tickettypes;

/**
 *
 * @author munya
 */

import com.tickets.interfaces.IBookable;
import com.tickets.app.IdGenerator;

public abstract class Ticket implements IBookable {

    protected final int ticketNumber;
    protected String customerName;
    protected String seat;
    protected double basePrice;
    protected boolean cancelled = false;

    public static int totalTickets = 0;
    public static Ticket[] allTickets = new Ticket[100];

    public Ticket(String customerName, double basePrice, String seat) {
        this.ticketNumber = IdGenerator.newId();
        this.customerName = customerName;
        this.basePrice = basePrice;
        this.seat = seat;
    }

    public abstract double calculateFinalPrice();

    // Method overloading 1
    public void buyTicket(double price) {
        this.basePrice = price;
        purchase();
    }

    // Method overloading 2
    public void buyTicket(double price, String seat) {
        this.basePrice = price;
        this.seat = seat;
        purchase();
    }

    // Interface implementation
    @Override
    public void buyTicket() {
        purchase();
    }

    private void purchase() {
        if (totalTickets < allTickets.length) {
            allTickets[totalTickets] = this;
            totalTickets++;

            System.out.println("Ticket purchased successfully!");
        } else {
            System.out.println("Ticket storage is full!");
        }
    }

    @Override
    public void cancelTicket() {
        cancelled = true;
        System.out.println("Ticket cancelled: " + ticketNumber);
    }

    @Override
    public void showTicketInfo() {
        System.out.println("--------------------------");
        System.out.println("Ticket Number: " + ticketNumber);
        System.out.println("Customer: " + customerName);
        System.out.println("Seat: " + seat);
        System.out.println("Ticket Price: $" + calculateFinalPrice());
        System.out.println("Status: " +
                (cancelled ? "Cancelled" : "Valid"));
    }

    public static void showAllTickets() {
        System.out.println("\nTOTAL TICKETS: " + totalTickets);

        for (int i = 0; i < totalTickets; i++) {
            allTickets[i].showTicketInfo();
        }
    }
}

