package Swithch_Statements;

import java.util.Scanner;

public class Nested_Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Member Id : ");
        int Players = input.nextInt();
        String Coaches ;


        switch (Players) {
            case 1:
                System.out.println("Rohan (R-Batsman)");
                break;
            case 2:
                System.out.println("Ajay (L-Batsman)");
                break;
            case 3:
                System.out.println("Manoj (R-Batsman)");
                break;
            case 4:
                System.out.println("Kartik (L-Batsman)");
                break;
            case 5:
                System.out.println("Shubhash (WK-R-Batsman)");
                break;
            case 6:
                System.out.println("Ranjit (R - All Rounder)");
                break;
            case 7:
                System.out.println("Manish (L- All Rounder)");
                break;
            case 8:
                System.out.println("Ashish (R-Bowler)");
                break;
            case 9:
                System.out.println("Mohit (L-Bowler)");
                break;
            case 10:
                System.out.println("Vinay (R-Batsman)");
                break;
            case 11:
                System.out.println("Aman (R-Bowler)");
                break;
            case 12:
                System.out.println("Coaches :");
                switch (Coaches = input.next()) {
                    case "Bowling":
                        System.out.println("Mr. Tejas (Bowling Coach)");
                        break;
                    case "Batting":
                        System.out.println("Mr. Dinesh Sharma (Batting Coach)");
                        break;
                    case "Main Coach":
                        System.out.println("Mr. Rajesh Mina (Main Coach)");
                        break;
                }
                break;
            default:
                System.out.println("NO member present with this id");
        }

    }
}

