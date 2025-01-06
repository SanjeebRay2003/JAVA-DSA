package Arrays.Array_List.Practice;

import java.util.Arrays;

// Q. Running sum of 1d array ( leetcode Q. 1480)
public class Q5 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        add(arr);
        System.out.println(Arrays.toString(arr));
//        System.out.println();

    }

    static int[] add(int[] arr){
        for (int i = 0;i< arr.length-1;i++){
            int X = arr[i] + arr[i + 1];
           arr[i+1] = X;
//            System.out.println(arr[i]);
        }
        return arr;
    }
}
