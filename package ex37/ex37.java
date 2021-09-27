/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabrielle Jackson
 */

 //this program generates a random password

import java.util.*;
public class ex37{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("What's the minimum length? ");
            int size = Integer.parseInt(input.nextLine());
        
        System.out.print("How many special characters? ");
            int special = Integer.parseInt(input.nextLine());
        
        System.out.print("How many numbers? ");
            int numbers = Integer.parseInt(input.nextLine());
        
        System.out.println("Your password is " + passwordGenerator(size, special, numbers));
    }//end of main
    
    // passwordgenerator
    public static String passwordGenerator(int length, int special, int nums) {
        // declaring strings and arrays
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$%^&*";
        String numbers = "1234567890";
        Random random = new Random();
        ArrayList<Character> chars = new ArrayList<>();
         
        for(int i=0; i<special; i++){
            chars.add(specialCharacters.charAt(random.nextInt(specialCharacters.length())));
        }
         
        for(int i=0; i<nums; i++){
            chars.add(numbers.charAt(random.nextInt(numbers.length())));
        }
        
        for(int i=chars.size()-1; i<length; i++){
            chars.add(letters.charAt(random.nextInt(letters.length())));
        }
        
        //shuffles options for password
        Collections.shuffle(chars);

        String password = "";

        for(Character s : chars){
            password += Character.toString(s);
        }
        
        return password;
    }//end of passwordGenerator
}//end of class