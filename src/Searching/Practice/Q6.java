package Searching.Practice;

import java.util.Arrays;

// search the index of target element in 2d array and return a 1d array of index
public class Q6 {
    public static void main(String[] args) {
        int[][] marks = {
                {45,86,54,68,45},
                {78,85,96,84},
                {96,87,88,99}
        };

        int target = 78;
        int[] newArr = search(marks,78);
        System.out.println(Arrays.toString(newArr));
        System.out.println(maxMarks(marks));
    }

    static int[] search(int[][] marks,int target){
        for (int i = 0;i<marks.length;i++){
            for (int j =0;j<marks[i].length;j++){
                if (marks[i][j] == target){
                    return new int[]{i,j} ;
                }
            }
        }
        return new int[]{-1,-1};
    }

    // Returns maximum value of element
    static int maxMarks(int[][] marks){
        int max = Integer.MIN_VALUE;
        for (int i = 0;i<marks.length;i++){
            for (int j =0;j<marks[i].length;j++){
                if (marks[i][j] > max){
                    max = marks[i][j];
                }
            }
        }
        return max;
    }
}
