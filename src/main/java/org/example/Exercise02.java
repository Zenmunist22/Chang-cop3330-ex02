package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Exercise02
{
    public static void main( String[] args )
    {
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the input string? ");
        input = sc.nextLine();
        System.out.print(input + " has " + input.length() + " characters.");

    }
}
