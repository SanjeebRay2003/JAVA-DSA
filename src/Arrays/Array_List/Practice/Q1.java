package Arrays.Array_List.Practice;

import java.util.Arrays;

// Q. Swap two elements of array
public class Q1 {
    public static void main(String[] args) {
        int[] array = {200, 20, 30, 40, 50, 100};

        Swap(array, 20, 100);
        System.out.println(Arrays.toString(array));
    }

    static void Swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
