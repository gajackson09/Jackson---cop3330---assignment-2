/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabrielle Jackson
 */

 //this program filters even numbers from the array

import java.util.*;
public class ex38{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            
        // prompt user to enter a string
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String numbers = input.nextLine();
            
        String list[] = numbers.split(" ");
            
        Integer evenList[] = evenOnly(list);
             
        System.out.print("The even numbers are ");
            for(int i=0; i < evenList.length; i++){
                if(i < evenList.length-1){
                    System.out.print(evenList[i] + " ");
                }
                else{
                    System.out.print(evenList[i] + ".");
                }
            }//end of for
        }//end of main
        

    public static Integer[] evenOnly(String list[]) {
        //declares arrays
        ArrayList<Integer> newList = new ArrayList<>();
            
            // now, loop to iterate over input array
            for(int i=0; i < list.length; i++){
                int num = Integer.parseInt(list[i]);
                if(num % 2 == 0){
                     newList.add(num);
                }
            }

            Integer[] arr = new Integer[newList.size()];
        arr = newList.toArray(arr);

        return arr;
    }//end of evenOnly
}//end of class