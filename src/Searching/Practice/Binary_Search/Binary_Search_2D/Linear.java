package Searching.Practice.Binary_Search.Binary_Search_2D;

import java.util.Arrays;

// search element in 2D array using Linear search
public class Linear {
    public static void main(String[] args) {

        int[][] arr = {
                {10,15,20},
                {25,33,35,38},
                {40,45,50},
                {10,18,30},
                {2,3,5,3},
                {0,15,55}
        };
        int target = 18;
        int[] index = binarySearch(arr,target);
        System.out.println(Arrays.toString(index));

    }

    static int[] binarySearch(int[][] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
