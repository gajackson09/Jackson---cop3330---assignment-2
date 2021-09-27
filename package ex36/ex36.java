/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabrielle Jackson
 */

 //this program prompts for response times from a website in milliseconds. It should keep asking for values until the user enters done

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
public class ex36{
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       ArrayList<Integer> numbers = new ArrayList<Integer>();
       String entry = null;
       
       //start a do-while loop
       do {
           System.out.print("Enter a number (enter done when finished): ");
                entry = input.next();
          
           if(!entry.equals("done")) {
               try {
                   int num = Integer.parseInt(entry);
                   numbers.add(num);
               }catch(NumberFormatException nfe) {
               }  
           }//end of if
       }while(!entry.equals("done"));
      
       //prints out the answers
       System.out.println("Numbers: "+ numbers.stream().map(String::valueOf).collect(Collectors.joining(",")));
       System.out.println("The average is " + average(numbers));
       System.out.println("The minimum is " + min(numbers));
       System.out.println("The maximum is " + max(numbers));
       System.out.println("The standard deviation is " + String.format("%.2f", std(numbers)));    
}//end of main

   //calculates average
   public static double average(ArrayList<Integer> numbers) {
       int total = 0;
       for(int num: numbers) {
           total += num;
       }
       double avg = (double)(total)/numbers.size();
       return avg;
   }//end of average
  
   //calculates the max numbers
   public static int max(ArrayList<Integer> numbers) {
       int max= numbers.get(0);     
       for(int num: numbers) {
           if(num > max)
               max = num;
       }    
       return max;
   }//end of max numbers

  //calculates the min numbers
   public static int min(ArrayList<Integer> numbers) {
       int min= numbers.get(0);    
       for(int num: numbers) {
           if(num < min)
               min = num;
       }  
       return min;
   }//end of min numbers

   //calculates standard deviation
   public static double std(ArrayList<Integer> numbers) {
       double mean = average(numbers); 
       double sum = 0;
       for(int num: numbers) {
           sum = sum + Math.pow((num-mean), 2);
       }
       double stdDev = Math.sqrt(sum/numbers.size()); 
       return stdDev;
   }//end of standard deviation
}//end of class