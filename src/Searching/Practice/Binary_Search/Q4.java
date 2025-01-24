package Searching.Practice.Binary_Search;

import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {

        int[] arr = {1,2,2,4,5,5,5,6,7,8,9};
        int[] ans = new int[2];
        int target = 2;
        int first = binarySearch(arr,target,true);
        int last = binarySearch(arr,target,false);
        ans[0] = first;
        ans[1] = last;

//        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(ans));
    }

    static int binarySearch(int[] arr, int target, boolean isFirst) {
        int start = 0;
        int end = arr.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target){
                mid = target;
                if(isFirst) {
                    end = mid - 1;
                    return end;
                } else {
                    start = mid + 1;
                    return start;
                }
            }
            else if (target < arr[mid]) {
                end =  mid - 1;
            } else if (target > arr[mid]) {
                start =  mid + 1;
            }
        }
        return result;
    }
}



