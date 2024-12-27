package Loops.Practice;

import java.util.Scanner;

// Q. show the input character is lowercase or UPPERCASE
public class Q2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the character :");
        char ch = input.next().trim().charAt(2);
        System.out.print(ch);

        if (ch >= 'a' && ch <= 'z'){
            System.out.println(" -> lowercase");
        }
        else {
            System.out.println(" -> UPPERCASE");
        }


    }
}

// input.next() => prints the input char value
// trim() => clear the extra spaces before String or char value
// charAt => returns the char value according to index
