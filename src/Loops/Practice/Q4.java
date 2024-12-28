package Loops.Practice;

import java.util.Scanner;

// Q. counting occurrence of a number
public class Q4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = input.nextInt();

        System.out.print("Search : ");
        int search = input.nextInt();
        int count = 0;

        while(number>0){
            double reminder = number % 10;
            if (reminder == search){
                count++;
            }
            number = number/10;
        }

        System.out.println(count + " times");

    }
}

/* number / 10 =>
        1425445 / 10 = 142544.5 ( here it ignore the value after point because of int value )
        142544 / 10 = 14254.45
        .
        .
        .
 */