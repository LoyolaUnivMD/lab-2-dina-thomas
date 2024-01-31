//Programmers: Dina Quevedo + Thomas Richards
//Course: CS212, Mr. John
//Due Date: 1/31/23
//Lab Assignment: 2
//Problem Statement: Create a lottery ticket generator that outputs 6 random numbers per 10 lottery tickets
//Data In: customer name
//Data Out: 6 random numbers per 10 lottery tickets, a good luck message, and the estimate jackpot amount
//Credits: Lab Prompt

//import Random, Scanner, and Decimal Format Utilities
import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;

class Lab2 {
    public static void main(String[] args) {
        long prize = 225938745L;
        Scanner input = new Scanner(System.in);

        System.out.println("CS 212 - Lab 2");
        System.out.println("This program generates 10 lottery tickets.");
        
        System.out.print("What's your name? ");
        String customerName = input.nextLine();

// Create variable for calling on the random utility
        Random rand = new Random();

// Create variable for calling on the Jackpot Dollar Sign format
        DecimalFormat jackpotFMT = new DecimalFormat("$,###");

// BEGINNING OF THE OUTPUT TO USER
        System.out.println("Here are the tickets: ");
        int num = 0;
        for(int i = 0; i < 10; i++){
            for(int y = 0; y < 6; y++){
                num = rand.nextInt(0,99);
                if(num < 10) {
                    System.out.print("0" + num + " ");
                }
                else {
                    System.out.print(num + " ");
                }

                }
            System.out.println();
            }
//  Strip and Split the Users Name
        String[] names = customerName.strip().split(" ");
        System.out.println("-----------------");
//  Treat the name as a list and only print the first name
        System.out.println("Good luck "+ names[0]"!");
        System.out.println("Estimated Jackpot:");

//  Call on the $ format to print out the prize money amount
        System.out.println(jackpotFMT.format(prize));
        System.out.println("-----------------");
        }




    }


