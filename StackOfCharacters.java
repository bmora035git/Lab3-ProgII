/*/**
 * InClass - 
   Benjamin O. Morales
   Programming II 
   CSCI 1437
   Due: 9/28/2026 
 
   InClass Assignment Lab II
   This InClass lab requires stack. The stack is to be used for checking
   for the use of parenthesis when inputting groups of digits.

   An opening parenthesis is provided first, follow by a close parenthesis.
   The stack is to be used to ensure the particular order is maintained.

 */


public class StackOfCharacters {
    private char[] elements;
    private int size;

    public StackOfCharacters() {
        this.elements = new char[0];
        this.size = 0;
    }

    public StackOfCharacters (int Capacity) {
       this.elements = new char[Capacity];
       this.size = this.elements.length;

    }
    public boolean empty(char[] elements) {
        if(elements.length == 0) {
            return true;
        }
        else {
            return false;
        }
        

    }
    
    public char peek() {`
        
    }

    public void push(char value) {

    }
    public char pop() {
        return 0;
    }

    public int getSize() {
        return 0;
    }
}   
