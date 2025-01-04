package Methods.Practice;

import java.util.Scanner;

// Q. Define a method that returns the product of two numbers entered by user.
public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your two numbers : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int result = Product(a,b);
        System.out.println(a+" * "+b+" = "+result);
    }

    static int Product(int a,int b){
        return a*b;
    }
}
