/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabrielle Jackson
 */

 //this program helps to determine how many months it will take to pay off a credit card balance
import java.util.Scanner;
import java.lang.Math;
public class ex26{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);     
        
    // prompt user to enter balance, apr, and monthly payment
        System.out.print("What is your balance? ");
        double b = Double.parseDouble(input.nextLine());
            
        System.out.print("What is the APR in the card (as a percent)? ");
        double apr = Double.parseDouble(input.nextLine());
            
        System.out.print("What is the monthly payment you can make? ");
        double p = Double.parseDouble(input.nextLine());
            
        // calulates the daily rate
        double i = apr/(365*100);
            
        // calculates the b/p
        double x = b/p;
            
        // calculates (1+i)^30
        double y = Math.pow((1+i),30);
            
        // calculates log(1+i)
        double z = Math.log(1+i);
            
        // calculates log(1 + b/p * (1 - (1+i)^30))
        double w = Math.log(1 + x *(1 - y));
            
        int n = (int)Math.ceil((-1 * w) / (z*30));
            
        System.out.println("It will take you " + n + " months to pay off this card.");
    }//end of main
}//end of class