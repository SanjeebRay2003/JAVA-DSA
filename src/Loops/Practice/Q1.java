package Loops.Practice;

import java.util.Scanner;

// Q. Find the largest of three input numbers
public class Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter numbers : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

//        int max = a;
//        if (b > max){
//            max = b;
//        }
//        if (c > max){
//            max = c;
//        }

        int max = Math.max(a,Math.max(b,c)); // using Math class

        System.out.println("Largest number : "+max);

    }
}
