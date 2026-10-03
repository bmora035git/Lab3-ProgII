/*/**
 * InClass - 
   Benjamin O. Morales
   Programming II 
   CSCI 1437
   Due: 9/28/2026 
 
   InClass Assignment Lab II
   This InClass lab requires character stack. The stack is to be used for checking
   for the use of parenthesis when inputting groups of digits.

   An opening parenthesis is provided first, follow by a close parenthesis.
   The stack is to be used to ensure the particular order is maintained.

 */

// Define the StackOfCharacters class
public class StackOfCharacters {

    // Define the private instance variables for the stack
    private char[] elements;
    private int size;

    // Define the no-args constructor for the stack
    public StackOfCharacters() {
        this.elements = new char[10];
        this.size = 0;
    }
    // Define the constructor for the stack with a specified capacity

    public StackOfCharacters (int Capacity) {
       this.elements = new char[Capacity];
       this.size = 0;

    }

    // Define the method to check if the stack is empty
    public boolean empty() {
        return size == 0;
    }
        
    // Define the method to peek at the top element of the stack
    public char peek() {
        return elements[size - 1];
        
    }

    // Define the method to push a new element onto the stack

    public void push(char value) {
        elements[size] = value;
        size++;

    }

    // Define the method to pop the top element of the stack
    public char pop() {
        size--;
        return elements[size];
    }

    // Define the method to get the size of the stack
    public int getSize() {
        return size;
    }

    // Define the method to get the elements of the stack
    public char[] getElements() {
        return elements;
    }
}   
