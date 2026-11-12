/*
 * Full Name: MUNYAWERA Anaclet
 * Registration Number: 25RP00508
 * Class: Y2 IT A
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tickets.users;

/**
 *
 * @author munya
 */


public class RegularUser extends User {

    public RegularUser(String name) {
        super(name);
    }

    @Override
    public void displayUser() {
        System.out.println("Customer Name: " + name);
    }
}
