package Methods.Practice;

import java.util.Scanner;

// Check the input number is prime or not
public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Number : ");
        int n = input.nextInt();
        boolean Prime = isPrime(n);
        System.out.println(Prime);

    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
//        return c * c > n;
        return true;
    }
}
