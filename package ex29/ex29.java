/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabrielle Jackson
 */

 //this program that prompts the rate of return on an investmate and calculates
import java.util.Scanner;
import java.lang.*;
import java.io.*;
class ex29{
   public static void main (String[] args){
       Scanner input = new Scanner(System.in);
       //declares variables
       int value;

       while(true){
           System.out.print("What is the rate of return? ");
           value = input.nextInt();
           System.out.println(value);
           if(value >= 1 && value <= 72){
               System.out.println("It will take " + (72/value) + " year to double your initial investment");
               break;
           }//end of if
           else{
               System.out.println("Sorry this is not a valid input");
           }//end of else
       }//end of while
   }//end of main
}//end of class