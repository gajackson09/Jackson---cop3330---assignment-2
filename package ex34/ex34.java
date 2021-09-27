/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabrielle Jackson
 */

 //this program contains a list of employees and asks the user which one to remove
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class ex34{
   public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    //declaring variables
    ArrayList<String> employees = new ArrayList<String>(Arrays.asList("John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"));
       
    printEmployees(employees);
 
    System.out.println();
    System.out.println("Enter an employee name to remove: ");
       String employeeRemove = input.nextLine();
      
       employees.remove(employeeRemove);//remove the employee from the array list
      
    System.out.println();
       printEmployees(employees);//print employees
   }//end of main
  
   public static void printEmployees(ArrayList<String> employees) {
       System.out.println("There are "+ employees.size() +" employees: ");
       for(String emp:employees) {
           System.out.println(emp);
       }//end of for
   }//end of printEmployees
}//end of class