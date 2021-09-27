/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabrielle Jackson
 */

 //this program prompts the user for 5 numbers and computes them
import java.util.Scanner;
import java.lang.*;
import java.io.*;
public class ex28{
   public static void main (String[] args){
       Scanner input = new Scanner(System.in);
       //declares variables
       int count = 1;
       int sum = 0;
       int numbers;

       while(count <6){
           System.out.print("Enter a number: ");
           numbers = input.nextInt();
           sum += numbers;
           count++;
       }//end of while

       System.out.println("The total is " + sum);
   }//end of main
}//end of class