/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabrielle Jackson
 */

//this program prints out the karvonen heart rate table
import java.util.Scanner;
import java.lang.*;
import java.io.*;
class ex31{
   public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    
    //asks user for input
    System.out.print("What is your resting heart rate: ");
        int restingHR = input.nextInt();
    System.out.print("What is your age: ");    
        int age = input.nextInt();

    //all of the table information
    System.out.println("Resting Pulse:" + restingHR + " Age:" + age);
       int intensity = 55;
       System.out.println("Intensity | Rate ");
       System.out.println("------------------------");
      
       while(intensity<96){
       int target = (((220 - age) - restingHR) * intensity) + restingHR;
       System.out.println(intensity+"% | "+ target +"bpm");
       intensity+=5;
       }//end of while
   }//end of main
}//end of class