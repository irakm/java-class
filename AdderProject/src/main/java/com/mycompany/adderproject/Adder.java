/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.adderproject;

import java.util.Scanner;

/**
 *@author Kim
 *email: kimirina45@hotmail.com
 *date: current date
 *purpose: Add
 */
            //Version 1 This program shows output, but no input.
         /*
public class Adder {

   
public static void main(String[] args) {
    // declare sum and initialize it to 0
    int sum = 0;
    // declare and initialize our operands
    int operand1 = 3;
    int operand2 = 2;

    //assign the sum of operand1 and operand2 to sum
    sum = operand1 + operand2;

    // NOTE: In the output below, the plus (+) operator
    // is acting as the string concatenation operator
    // instead of the addition operator.  In Java, we use
    // the plus (+) operator to concatentate (or glue together
    // string values.
    System.out.println("Sum is: " + sum);
}

   
}
*/
 //Version 2
        public class Adder {
    public static void main(String[] args) {
    // declare the number variables and initialize to 0
    int sum = 0;
    int operand1 = 0;
    int operand2 = 0;

    // declare and initialize a Scanner object - the Scanner reads
    // input from the console
    
    Scanner myScanner = new Scanner(System.in);

    // declare and initialize String (text) variables to hold the
    // values that the user types in - the Console only accepts
    // text, it knows nothing about numbers
    String stringOperand1 = "";
    String stringOperand2 = "";

    // ask the user to input the first operand
    System.out.println("Please enter the first number to be added:");

    // now wait until the user types something in - put the value
    // in stringOperand1
    stringOperand1 = myScanner.nextLine();

    // ask the user to input the second operand:
    System.out.println("Please enter the second number to be added:");

    // now wait until the user types something in - put the value
    // in stringOperand2
    stringOperand2 = myScanner.nextLine();

    // in order to add the values input by the user we must
    // convert the String values into int values.  We use the
    // parseInt method for this:
    operand1 = Integer.parseInt(stringOperand1);
    operand2 = Integer.parseInt(stringOperand2);

    // assign the sum of operand1 and operand2 to sum
    sum = operand1 + operand2;


    // print the sum to the console
   System.out.println("Sum is: " + sum);
    }
}