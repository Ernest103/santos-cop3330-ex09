package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ernesto Santos
 */
public class App 
{
    public static void main( String[] args )
    {
        final int GALLONS = 350;

        Scanner sc = new Scanner(System.in);
        double length, width, area, gallonsNeeded;

        System.out.print("What is the length of the room? ");
        length = sc.nextInt();

        System.out.print("What is the width of the room? ");
        width = sc.nextInt();

        area = length * width;
        gallonsNeeded = (int)Math.ceil(area / GALLONS);

        System.out.println("You will need to purchase "+ gallonsNeeded
                +" gallons of paint to cover "+ area +" square feet.\n");
    }
}
