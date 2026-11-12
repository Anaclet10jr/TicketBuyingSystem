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

public class StandardTicket extends Ticket {

    public StandardTicket(String name, double price, String seat) {
        super(name, price, seat);
    }

    @Override
    public double calculateFinalPrice() {
        return basePrice;
    }
}

