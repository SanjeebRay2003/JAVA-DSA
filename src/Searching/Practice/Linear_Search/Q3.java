package Searching.Practice.Linear_Search;

// Q. search element of array in a range
public class Q3 {
    public static void main(String[] args) {

        int[] arr = {45,75,65,48,25,13,56,45,44,124,154,235,74,8};
        int target = 13;
        int index = Search(arr,2,8,target);
        System.out.println("Present at index "+ index);

    }

    // Return index of character
    static int Search(int[] arr,int start,int end,int target){
        if (arr.length == 0){
            return -1;
        }

        for (int index = start; index <=end; index++) {
            if (target == arr[index]){
                return index;
            }
        }
        return -1;
    }
}
