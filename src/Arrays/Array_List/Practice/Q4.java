package Arrays.Array_List.Practice;

import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {

        int[] array = {200, 20, 30,60, 40, 50, 1000,400};
        reverse(array);
        System.out.println(Arrays.toString(array));

    }

    static void Swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            Swap(arr,start,end);
            start++;
            end--;
        }
    }
}
