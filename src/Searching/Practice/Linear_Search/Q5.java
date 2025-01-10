package Searching.Practice.Linear_Search;

// Q. search smallest element or array in a range
public class Q5 {
    public static void main(String[] args) {
        int[] arr = {45,48,65,78,154,40,10,25,5,-2};
        System.out.println(small(arr,1,5));
    }

    static int small(int[] arr,int start,int end){
        int min = arr[start];
        for (int i= start;i<=end;i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
