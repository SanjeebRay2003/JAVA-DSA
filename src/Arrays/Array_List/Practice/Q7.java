package Arrays.Array_List.Practice;

import java.util.Arrays;

public class Q7 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,4,5,2,3,4,5,2,4};
        int[] newArr = twoSum(arr,9);
        System.out.println(Arrays.toString(newArr));
    }

    static int[] twoSum(int[] arr,int target) {

        int[] Y = null;
        int[] X = null;
        int[] Z = null;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length-1; j >= 0; j--) {
                if (arr[i] + arr[j] == target) {
                    X = new int[]{arr[i], arr[j]};
                }
            }
        }
        System.out.println(Arrays.toString(X));
        System.out.println(Arrays.toString(Y));


        return X;
    }
}
