/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabrielle Jackson
 */

 //this program picks a winner from a pool of users

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class ex35{
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //declaring variables       
       String name = null;
       ArrayList<String> nameList = new ArrayList<String>();
       
       //start a do-while loop to take name
       do {
           System.out.print("Enter a name:");
           name= input.nextLine();
           if(!name.isBlank() && !name.isEmpty())
               nameList.add(name);
       }while(!name.isBlank() && !name.isEmpty());
      
       //generates a random pool
       Random random = new Random();
       int randomIndex = random.nextInt(nameList.size());
      
       //picks the random winner
       System.out.println("The winner is... "+nameList.get(randomIndex));     
   }//end of main
}//end of class