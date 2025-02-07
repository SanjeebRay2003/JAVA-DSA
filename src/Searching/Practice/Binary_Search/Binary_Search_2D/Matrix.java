package Searching.Practice.Binary_Search.Binary_Search_2D;

import java.util.Arrays;

public class Matrix {

    public static void main(String[] args) {

        int[][] arr = {
                {5, 8, 12, 16},
                {7, 9, 15, 19},
                {11, 13, 21, 25},
                {14, 17, 24, 28}
        };

       int[] index =  binarySearch(arr,24);
        System.out.println(Arrays.toString(index));
    }

    static int [] binarySearch(int[][] arr,int target){
      int row = 0;
      int col = arr.length-1;

      while (row < arr.length && col >= 0){
          if (arr[row][col] == target){
              return new int[]{row,col};
          }
          if (arr[row][col] < target ){
              row++;
          }
          else {
              col--;
          }
      }

      return new int[] {-1,-1};

    }
}
