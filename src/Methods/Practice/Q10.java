package Methods.Practice;

import java.util.Scanner;

// Q. Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        double Radius = input.nextInt();
        System.out.println("Circumference of Circle : "+Circumference(Radius));
        System.out.println("Area of Circle : " + Area(Radius));
    }

    static final double PI = 3.14;

    static double Circumference(double radius){
        return 2*PI*radius;
    }

    static double Area(double radius){
        return PI*radius*radius;
    }

}
