package Arrays.MultiDimensional_Array;

import java.util.Arrays;

public class NO_column {
    public static void main(String[] args) {
        int[][] array = { // row is mandatory and column is not mandatory here
                {1,8,6,78},
                {8,6,9},
                {8},
                {8,920},
                {78,96,45,885,965,44}
        };

        System.out.println("All elements of array :");

//        for (int row = 0;row<array.length;row++){
//            for (int column = 0;column<array[row].length;column++){
//                System.out.print(array[row][column]+ " ");
//            }
//            System.out.println();
//        }

        for (int[] e: array){
            System.out.println(Arrays.toString(e));
        }
    }
}
