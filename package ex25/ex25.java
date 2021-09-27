/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabrielle Jackson
 */

 //this program determines the complexity of a given password
 import java.io.*;
 import java.util.*;
 public class ex25{
    public static void passwordValidator(String input){
        int x = input.length();
        boolean letters = false, digits = false, specialchar = false;
        Set<Character> set = new HashSet<Character>(
            Arrays.asList('!', '@', '#', '$', '%', '^', '&','*', '(', ')', '-', '+'));

        for(char i: input.toCharArray()){
            if(Character.isLetter(i))
                letters = true;
            if(Character.isDigit(i))
                digits = true;
            if(set.contains(i))
                specialchar = true;
        }//end of for
   
        //prints out the strength of the password with the main
        System.out.print("The password "+input);
        if (digits && letters && specialchar && (x >= 8))

        System.out.println(" is a Very Strong Password");
        else if (letters && digits && (x >= 8))
        
        System.out.println(" is a Strong Password ");
        else if (letters && (x<8))
        
        System.out.println(" is a Weak Password");
        else if (digits && (x<8))
        
        System.out.println(" is a Very Weak Password");
        else
        
        System.out.println(" is Undetermined");
    }//end of passwordValidation

    public static void main(String[] args){
        String input = "12345";
        passwordValidator(input);

        input = "abcdef";
        passwordValidator(input);

        input = "abc123xyz";
        passwordValidator(input);

        input = "1337h@xor!";
        passwordValidator(input);

    }//end of main
 }//end of class