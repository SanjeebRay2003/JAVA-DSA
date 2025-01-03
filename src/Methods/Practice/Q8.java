package Methods.Practice;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your two numbers : ");
        int a = input.nextInt();
        int b = input.nextInt();

        int sum = sum(a,b);
        System.out.println(a+" + "+b +" = "+sum);


    }

    static int sum(int a,int b){
        return a+b;
    }


}
