package exercise02;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution 1
 *  Copyright 2021 Dustin Battles
 */

/*
 * In order to tackle this one let's first prompt the user for a string
 * Second, measure the number of characters in the string using a for loop
 * Third, save the number of characters to an int so that we can
 * Display both in the same sentence :)
 */

public class solution02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String string = "i";
        int loop = 1;

        while (loop == 1)
        {
            System.out.println("What word would you like to test?");
            string = input.nextLine();

            if(string.length() == 0)
            {
                System.out.println("Please choose an actual word!");
            }
            else
            {
                loop = 0;
            }
        }

        int count = string.length();

        System.out.println(string + " is " + count + " characters long!");
    }
}
