/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabrielle Jackson
 */

 //this program Prompt for the difficulty level, and then start the game. The computer picks a random number in that range and prompts the player to guess that number. 

import java.util.Scanner;
class ex32{
public static void main( String args[]){
    Scanner input = new Scanner(System.in);
    //declaring variables
    int diff, gnumber, usernum, counter = 0;
    char choice ='y';
    
   System.out.println("\nLets play Guess Number!");
   while(choice =='y' || choice =='Y'){
   System.out.print("\nEnter the difficulty level ( 1,2, or 3) : ");
        diff = input.nextInt();
   
   gnumber = (int)Math.floor(Math.random()*(Math.pow(10,diff)-1+1)+1);
   System.out.print("I have my number. What's your guess? ");
   while(true){
   usernum= input.nextInt();
       if(gnumber == usernum){
       counter++;
       System.out.println("You got in " + counter + " guesses !");
        break;
    }

       else if(gnumber > usernum){
       System.out.print("Too low. Guess again: ");
       counter++;
       }

       else if(gnumber < usernum){
       System.out.print("Too high. Guess again: ");
       counter++;
       }
   }//end of while2

   System.out.print("\nDo you wish to play again (Y/N)?");
   choice = input.next().charAt(0);
   counter = 0;

   }//end of while
}//end of main
}//end of class