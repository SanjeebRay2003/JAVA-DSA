package Methods.Practice;

import java.util.Scanner;

// Q. Swapping two input numbers
public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        int a = input.nextInt();
        System.out.print("b = ");
        int b = input.nextInt();

//        System.out.println(a +" "+ b);
        swap(a,b);
        System.out.println(a);


    }

    static void swap(int a ,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = "+a+ " | b = "+b);
    }
}
