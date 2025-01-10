package Searching.Practice.Linear_Search;

// Q. search the index of target element in the array
public class Q1 {
    public static void main(String[] args) {

        int[] arr = {45,75,65,47,85,22,5,4,66,555,88,451,245};
        int target = 555;
        int Index = linearSearch(arr,target);
        System.out.println(presentOrNot(arr,target));
        System.out.println(Index);

    }

    // Return the index of targeted element
    static int linearSearch(int[] arr,int target){
        if (arr.length == 0){
            return -1;
        }

        for (int index = 0;index<arr.length;index++){
            int element = arr[index];
            if (arr[index] == target){
                return index;
            }
        }

        return -1;
    }

    // Return Boolean value
    static boolean presentOrNot(int[] arr,int target){
        if (arr.length == 0){
            return false;
        }

        for (int index = 0;index<arr.length;index++){
            int element = arr[index];
            if (arr[index] == target){
                return true;
            }
        }

        return false;
    }

}
