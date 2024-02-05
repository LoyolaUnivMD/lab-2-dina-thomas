//Programmers: Dina Quevedo + Thomas Richards
//Course: CS212, Mr. John
//Due Date: 1/31/23
//Lab Assignment: 2
//Problem Statement: Create lottery ticket generator
//Data In: Users name
//Data Out: 10 lottery tickets, good luck message, and possible jackpot
//Credits: Lab Prompt

// Import Random, Scanner, DecimalFormat
import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;

class Lab2 {
    public static void main(String[] args) {

        //makes a new scanner called input
        Scanner input = new Scanner(System.in);
        //  Create variables to call on random utility and Decimal Format utility
        Random rand = new Random();
        DecimalFormat jackpotFMT = new DecimalFormat("$,###.##");

        //prints the purpose of the program
        System.out.println("CS 212 - Lab 2");
        System.out.println("This program generates 10 lottery tickets.");

        //gets the users name
        System.out.print("What's your name? ");
        String customerName = input.nextLine();

        //strips the name of any whitespace then splits the name by space in the middle
        String[] names = customerName.strip().split(" ");

        //gets input for initial bet
        System.out.print("How much do you want to play? ");
        double prize = input.nextDouble();

        //outputs the persons name and how much they want to play
        System.out.println("Great! "+ names[0] + " wants to play "+ jackpotFMT.format(prize));

        //list of winning numbers from README
        int[] winningNums = { 3, 5, 16, 58, 59, 11};


        //message to lt user know about to print the tickets
        System.out.println("Here are the tickets: ");
        //makes a new int called num
        int num = 0;
        //loops 10 times
        for(int i = 0; i < 10; i++){
            //loops 6 times
            for(int y = 0; y < 6; y++){
                //generates a random int between 0 and 99
                num = rand.nextInt(0,99);
                //loops through each winning number
                for (int j = 0; j < winningNums.length; j++){
                    //compares the random to the winning numbers, and if it is, multiplies the prize by a power of 1.75
                    if (num == winningNums[j]){
                        prize = Math.pow(prize,1.75);
                    }
                }
                //if the random int is less than 10
                if(num < 10) {
                    //output a 0 then the random int then a space
                    System.out.print("0" + num + " ");
                }
                //otherwise output the random int then a space
                else {

                    System.out.print(num + " ");
                }

                }
            //makes a new line
            System.out.println();
            }
        //outputs a line
        System.out.println("-----------------");
        //outputs a goodluck message
        System.out.println("Good luck "+ names[0]);
        //outputs a line
        System.out.println("-----------------");
        //outputs the winnings, and formats it so there is a $ in front and commas every 3 numbers
        System.out.println("Your winnings are :");
        System.out.println(jackpotFMT.format(prize));
        //outputs a line
        System.out.println("-----------------");
        }




    }


