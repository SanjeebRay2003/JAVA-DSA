package Searching.Practice.Binary_Search;

public class Q1 {
    public static void main(String[] args) {

        int[] arr = {5,8,10,12,14,18,19,25,31,56};
        binarySearch(arr,19);

    }

    static int binarySearch(int[] arr,int target){

        int result = -1;
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start+(end-start)/2;
            if (arr[mid] == target) {
                result = mid;
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }

        if (result == -1){
            System.out.println("Element not found");
        }else {
            System.out.println("The element "+target+" is at index "+result);
        }

        return result;
    }

}
