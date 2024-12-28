package Loops.Practice;

import java.util.Scanner;

// Q. Revers the input number
public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = input.nextInt();

        int reverse = 0;
        while (number>0){
            int reminder = number % 10;
            number /= 10;
            reverse = reverse * 10 +reminder;
//            System.out.println(reverse);
        }

        System.out.println("Reverse : "+reverse);
    }
}
