package Arrays.Array_List.Practice;

import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {
        int[][] accounts = {
                {4,5,9},
                {7,8,9},
                {4,5,7}
        };

//        richest(accounts);
        System.out.println(richest(accounts));
    }

    static int richest(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j: arr[i]){
                sum =+ j;
            }
            System.out.println(sum);
        }
        return sum;
    }
}
