package Searching.Practice.Linear_Search;

// Q. search the smallest element of array
public class Q4 {
    public static void main(String[] args) {

        int[] arr = {45,48,65,78,154,40,10,25,5,-2};
        System.out.println(small(arr));

    }

    static int small(int[] arr){
        int min = arr[0];
        for (int i= 1;i<arr.length;i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
