package Searching.Practice.Binary_Search;



public class Q3 {
    public static void main(String[] args) {

        int[] arr = {100,80,80,64,53,50,48,46,41,39,33,25,17,12,4};
        int[] arr2 = {-10,-8,-5,-3,0,3,7,8,9,11,14,20,19,22,27,29,32,35,37,49};
       int index = AscOrDsc(arr,48);
        System.out.println(index);
       int index2 = AscOrDsc(arr2,-3);
        System.out.println(index2);

    }

    static int AscOrDsc(int[] arr,int target) {

        int start = 0;
        int end = arr.length - 1;

        boolean Ascending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (Ascending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }

            else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }

            }

        }
        return -1;
    }

}
