package Arrays;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
//        numbers[0] = 10;
//        numbers[1] = 20;
//        numbers[2] = 30;
//        numbers[3] = 40;
//        numbers[4] = 50;
//        System.out.println(numbers[3]);

        for (int i = 0;i<numbers.length;i++){
            numbers[i] = input.nextInt();
        }

        for (int e:numbers){
            System.out.print(e+" ");
        }


    }
}
