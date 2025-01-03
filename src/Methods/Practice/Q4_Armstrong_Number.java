package Methods.Practice;

import java.util.Scanner;

// check the input number is Armstrong number or not and print all the Armstrong numbers from 100 to 1000
public class Q4_Armstrong_Number {
    public static void main(String[] args) {

        // checks the input number is Armstrong number or not
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 digit number : ");
        int n = input.nextInt();
        Boolean Armstrong = ArmStrong_Number(n);
        System.out.println(Armstrong);


        // print all the Armstrong numbers from 100 to 1000
        System.out.println("Armstrong numbers from 100 to 1000.");
        for (int i = 100;i<=1000;i++){
            if (ArmStrong_Number(i)){
                System.out.println(i + " ");
            }
        }

    }

    static boolean ArmStrong_Number(int n){
        int num = n;
        int sum = 0;
        while (n>0){
            int rem = n%10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }
        return sum == num;
    }

}
