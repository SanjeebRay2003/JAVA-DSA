package Loops.Practice;

import java.util.Scanner;

// Q. show the character is Lowercase or Upper case
public class Q2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = input.next().trim().charAt(5);
        System.out.println(ch);

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        }
        else {
            System.out.println("Uppercase");
        }


    }
}

// input.next() => prints the input char value
// trim() => clear the extra spaces before String or char value
// charAt => returns the char value according to index
