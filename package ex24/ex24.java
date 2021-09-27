/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabrielle Jackson
 */

 //this program compares 2 string and determines if they are an anagram
 import java.util.Scanner;
 public class ex24{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter 2 Strings and I'll tell you if they are anagrams:");
    System.out.print("Enter the first string: ");
        String worda = input.next();
    System.out.print("Enter the second string: ");
        String wordb = input.next();

    if(isAnagram(worda,wordb))
        System.out.println(worda +" and "+ wordb +" are anagrams");
    else
        System.out.println(worda +" and "+ wordb +" are not anagrams");  
    }//end of main

    //class to figure out if the words are an anagram
    public static boolean isAnagram(String str1,String str2){
        if(str1.length() != str2.length()) return false;
        int [] freq = new int[26];
        for(int i = 0 ; i < str1.length(); i++){

        freq[str1.charAt(i)-'a']++;
        freq[str2.charAt(i)-'a']--;
    }//end of for
    
        for(int x: freq){
            if(x != 0) return false;
        }//end of for
    return true;

    }//end of isAnagram
 }//end of class