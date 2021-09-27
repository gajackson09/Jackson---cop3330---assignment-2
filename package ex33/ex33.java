/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabrielle Jackson
 */

 //this program creates a magic 8 ball that answers a question with yes, no, maybe, or ask again later

import java.util.Random;
import java.util.Scanner;
public class ex33{
   public static void main(String[] args) {
       //declaring variables and scanner
       String[] answers = {"Yes","No","Maybe","Ask again later"};
       Random random = new Random();
       Scanner input = new Scanner(System.in);
          
       System.out.println("What's your question?");
       String userquestion = input.nextLine();//get the question
      
       int randomResponseIndex = random.nextInt(answers.length);
       String answer = answers[randomResponseIndex];
      
       System.out.println();
       System.out.println(answer);
   }//end of main
}//end of class