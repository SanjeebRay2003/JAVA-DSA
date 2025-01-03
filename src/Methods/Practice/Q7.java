package Methods.Practice;

import java.util.Scanner;

// Q. A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = input.nextInt();
        Eligibility(age);
    }

    static void Eligibility(int age){
        if (age >=18){
            System.out.println("Eligible for Voting");
        }
        else {
            System.out.println("You are Under age, Unable for Voting");
        }
    }
}
