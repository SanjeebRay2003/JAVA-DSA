package Searching.Practice.Binary_Search;

public class Q2 {
    public static void main(String[] args) {

        int[] arr = {-10,-8,-5,-3,0,3,7,8,9,11,14,16,19,22,27,29,32,35,37,49};
        int target = 29;
        int index = binarySearch(arr,target);
        System.out.println(index);

    }

    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start + (end-start)/2;
            if (target<arr[mid]){
                    end = mid-1;
            } else if (target>arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
