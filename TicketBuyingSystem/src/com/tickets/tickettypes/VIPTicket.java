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
 * @author munyawera
 */

public class VIPTicket extends Ticket {

    private final double vipFee = 5.0;
    private final String extra = "Snacks: Popcorn";

    public VIPTicket(String name, double price, String seat) {
        super(name, price, seat);
    }

    @Override
    public double calculateFinalPrice() {
        return basePrice + vipFee;
    }

    @Override
    public void showTicketInfo() {
        super.showTicketInfo();
        System.out.println("VIP Benefit: " + extra);
        System.out.println("VIP Fee: $" + vipFee);
    }
}

