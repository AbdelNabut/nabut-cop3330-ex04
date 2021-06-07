/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 abdel nabut
 */


package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        String noun, verb, adjective, adverb;
        Scanner input = new Scanner(System.in);
        System.out.print( "Enter a noun: ");
        noun = input.next();
        System.out.print( "Enter a verb: ");
        verb = input.next();
        System.out.print( "Enter a adjective: ");
        adjective = input.next();
        System.out.print( "Enter a adverb: ");
        adverb = input.next();
        System.out.printf("I like to %s with the %s %s %s", verb, adjective, noun, adverb);

    }
}
