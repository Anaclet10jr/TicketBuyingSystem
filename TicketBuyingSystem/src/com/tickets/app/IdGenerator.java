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


public final class IdGenerator {

    private static int nextId = 1001;

    private IdGenerator() {
        // Prevent object creation
    }

    public static int newId() {
        return nextId++;
    }
}

