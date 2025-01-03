package Methods.Practice;

import java.util.Scanner;

// Q. Define a program to find out whether a given number is even or odd.
public class Q6 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Number : ");
//        int n = input.nextInt();
        int n = 44;
        EvenOdd(n);
    }

    static void EvenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        }
    }

}
