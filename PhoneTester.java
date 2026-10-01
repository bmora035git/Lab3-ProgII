/*
    InClass - 
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
import java.util.Scanner;

public class PhoneTester {
    

    
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String phoneNumber;
        boolean isValid;
        StackOfCharacters stack = new StackOfCharacters();
        StringBuilder validNumber = new StringBuilder();
        String pattern = "\\d{3}-\\d{3}-\\d{4}";
        
        
        System.out.print("Enter a phone number: ");
        phoneNumber = input.nextLine();


        

        while(isValid = true) {
            int i = 0;
            if(phoneNumber.charAt(i) == '(') {
                stack.push(phoneNumber.charAt(i));
            }
            if(phoneNumber.charAt(i) == ')') {
                stack.pop(phoneNumber.charAt(i));
                
            }
            if(phoneNumber.empty() == true) {
                isValid = false;
            }
            if(phoneNumber.charAt(i) != '(' || phoneNumber.charAt(i) != ')') {
                validNumber.append(phoneNumber.charAt(i));
            }

            i++;
            

        }
    }
    

    


}
