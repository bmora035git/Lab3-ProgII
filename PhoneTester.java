/*
   Lab 3 Programming II 
   Benjamin O. Morales
   Programming II 
   CSCI 1437
   Due: 9/28/2026 
 
   Lab Assignment 3 Programming II
   
   We will define a Scanner object to read in a string of characters. 
   The string will be checked for the use of parenthesis. 
   The stack is to be used to ensure the particular order is maintained.

   Next we will de a String variable to hold the user's input
   of the phone number.

   A boolean variable will be usd to indicate if a number
   If it is valid, the boolean varible will be set to true. If it is invalid, 
   the boolean variable will be set to false.

   A Stack of Characters object will be created to
   to store parenthesis.  We will intialize the stack with
   with the no-args constructor.  

   A StringBuilder variable that will be used to
   store the rest of the characters in the phone number.  
   
   We will initialize the StringBuilder variable with the no-args constructor.

   Next, a string variable that will hold the pattern for a valid
   phone number assuming no parenthesis.  The pattern is 3 digits
   followed by a dash, 3 more digits, another dash, and 4 more digits.
   
   

*/

// Decloare the package and import statements

import java.util.Scanner;

// Define the PhoneTester class
public class PhoneTester {

    // Define the main method

    static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Declare variables to hold the phone number, validity status, stack, and valid number
        String phoneNumber;
        boolean valid = true;

        // Create a StackOfCharacters object to store parenthesis
        StackOfCharacters stack = new StackOfCharacters();
        // Create a StringBuilder object to store the valid phone number
        StringBuilder validNumber = new StringBuilder();

        // Define a string variable to hold the pattern for a valid phone number
        String pattern = "\\d{3}-\\d{3}-\\d{4}";

        // Prompt the user to enter a phone number and read the input
        System.out.print("Enter a phone number: ");
        phoneNumber = input.nextLine();

        // Append the entered phone number to the validNumber StringBuilder
        validNumber.append(phoneNumber);


        // Print the entered phone number and the pattern for a valid phone number
        for (int i = 0; i < phoneNumber.length(); i++) {

            // Get the current character from the phone number
            char ch = phoneNumber.charAt(i);

            // Check if the character is an opening parenthesis, closing parenthesis, or a valid digit/dash
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.empty()) {
                    valid = false;
                    break;
                }
                stack.pop();
            } else if (ch != '-' && !Character.isDigit(ch)) {
                valid = false;
                break;
            }
        }
        // Check if the stack is empty after processing all characters

        if (!stack.empty()) {
            valid = false;
        }

        // Check if the validNumber matches the pattern for a valid phone number
        
        if (valid) {
            System.out.println("Valid number: " + validNumber.toString());
        } else {
            System.out.println("Invalid phone number format.");
        }
        
        
    }
}
// ...existing code...