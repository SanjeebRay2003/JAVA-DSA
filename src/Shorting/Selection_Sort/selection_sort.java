package Shorting.Selection_Sort;

//import static com.sun.tools.javac.jvm.ByteCodes.swap;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {

        int[] array = {-1,-5,-75,7,8,6,45,89,25,14,35};
        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println(Arrays.toString(array));

    }

    static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0;i<=n-1;i++){
            int min = arr[i];
            int minIndex = i;
            for(int j = i+1;j<n;j++){
                if (arr[j]<min){
                    min = arr[j];
                    minIndex = j;
                }
            }
            swap(arr,i,minIndex);
        }
    }

    static void swap(int[] arr,int index1,int index2){

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        
    }

}
