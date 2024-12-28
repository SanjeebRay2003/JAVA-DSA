package Swithch_Statements;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Day number : ");
        int Days = input.nextInt();

        switch (Days){

            case 1 :
                System.out.println("Monday");
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Enter valid number of days");
//                break;
        }
    }
}
