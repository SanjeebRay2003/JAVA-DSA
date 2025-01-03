package Methods.Practice;

import java.util.Scanner;

// Q. Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Numbers : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        System.out.println("Maximum : "+max(a,b,c));
        System.out.println("Minimum : "+min(a,b,c));

    }

    static int max(int a,int b,int c){
        int Big = Math.max(a,Math.max(b,c));
        return Big;
    }

    static int min(int a,int b,int c){
        int Small = Math.min(a,Math.min(b,c));
        return Small;
    }

}
