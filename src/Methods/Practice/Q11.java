package Methods.Practice;

/* Q. Write a program that will ask the user to enter his/her marks (out of 100).
 Define a method that will display grades according to the marks entered as below:
*/

import Swithch_Statements.Switch;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Marks : ");
        Double marks = input.nextDouble();
        Grades(marks);
    }

    static void Grades(Double marks){

        if (marks>100 || marks<0) {
            System.out.println("Enter valid marks (0 - 100)");
        }
        else if (marks>90){
            System.out.println("Grade : AA");
        }
        else if (marks>80) {
            System.out.println("Grade : AB");
        }
        else if (marks>70) {
            System.out.println("Grade : BB");
        }
        else if (marks>60) {
            System.out.println("Grade : BC");
        }
        else if (marks>50) {
            System.out.println("Grade : CC");
        }
        else if (marks>40) {
            System.out.println("Grade : DD");
        }
        else {
            System.out.println("You are Fail");
        }


    }
}
