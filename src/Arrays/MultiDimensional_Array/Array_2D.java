package Arrays.MultiDimensional_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int[][] array = new int[3][3];
        System.out.println("Enter elements of 2D array : ");

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                array[row][column] = input.nextInt();
            }
        }


        System.out.println("Output : ");

//        for (int row = 0; row < array.length; row++) {
//            for (int column = 0; column < array[row].length; column++) {
//                System.out.print(array[row][column] + " ");
//            }
//            System.out.println();
//        }
//
//        for (int row = 0; row < array.length; row++) {
//            System.out.println(Arrays.toString(array[row]));
//        }

        for (int[] arr : array) {
            System.out.println(Arrays.toString(arr));
        }


    }
}
