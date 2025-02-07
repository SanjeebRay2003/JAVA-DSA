package Shorting.Bubble_Short;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {

        int[] arr = {45,15,45,35,62,63};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {

            for (int j = 1; j < arr.length-1; j++) {

                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }

            }

        }
    }
}
