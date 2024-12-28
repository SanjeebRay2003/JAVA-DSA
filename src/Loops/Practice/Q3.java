package Loops.Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Q. Show the n'th fibonacchi number
public class Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter n number : ");
        int n = input.nextInt();

        int a = 0;
        int b = 1;
        int i = 0;

//        List<Integer> list = new ArrayList<>();

        while(i<=n){
            int temp = b;
            b = b + a;
            a = temp;
            i++;
//            list.add(b);
        }
        System.out.println(b);
//        System.out.println(list);
    }
}
