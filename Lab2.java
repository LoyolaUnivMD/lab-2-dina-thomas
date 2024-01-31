
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
        DecimalFormat jackpotFMT = new DecimalFormat("$,###");

        System.out.println("Here are the tickets: ");
        //makes a new int called num
        int num = 0;
        //loops 10 times
        for(int i = 0; i < 10; i++){
            //loops 6 times
            for(int y = 0; y < 6; y++){
                //generates a random int between 0 and 99
                num = rand.nextInt(0,99);
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
        //strips the name of any whitespace then splits the name by space in the middle
        String[] names = customerName.strip().split(" ");
        //outputs a line
        System.out.println("-----------------");
        //outputs a goodluck message then the first name
        System.out.println("Good luck "+ names[0]);
        //outputs the estimated jackpot, and formats it so there is a $ in front and commas every 3 numbers
        System.out.println("Estimated Jackpot:");
        System.out.println(jackpotFMT.format(prize));
        //outputs a line
        System.out.println("-----------------");
        }




    }


