// Programmers:  [your names here]
// Course:  CS 212
// Due Date:
// Lab Assignment:
// Problem Statement:
// Data In:
// Data Out:
// Credits: [Is your code based on an example in the book, in class, or something else?
//            Reminder: you should never take code from the Internet or another person

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

        Random rand = new Random();
        DecimalFormat fmt = new DecimalFormat("0#");
        DecimalFormat jackpotFMT = new DecimalFormat("$,###");

        System.out.println("Here are the tickets: ");
        int num = 0;
        for(int i = 0; i < 10; i++){
            for(int y = 0; y < 6; y++){
                num = rand.nextInt(0,99);
                if(num < 10) {
                    System.out.print(fmt.format(num));
                }
                else {
                    System.out.print(num);
                }

                }
            System.out.println();
            }
        System.out.println("-----------------");
        System.out.println("Good luck "+ customerName.strip().split(" "));
        }




    }

