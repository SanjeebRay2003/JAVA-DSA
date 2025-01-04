package Methods.Practice;

import java.util.Scanner;

// Q. Write a program to print the factorial of a number by defining a method named 'Factorial
public class Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Number : ");
        int n = input.nextInt();
        System.out.println("factorial of "+n+" is "+factorial(n));
    }

    static int factorial(int n){
        if (n == 0){
            return 1;
        }

//            return n * factorial(n - 1);
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *=i ;
            }
        return fact;
    }
}
