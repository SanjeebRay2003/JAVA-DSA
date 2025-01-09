package Searching.Practice;

// Q. find elements with even number of digits (leetcode Q. 1295)
public class Q8 {
    public static void main(String[] args) {
        int[] arr = {45,758,65,48,5555,78,454,855,444};
        int evenDigits = findNums(arr);
        System.out.println(evenDigits);

    }
    static int findNums(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (even(num)) count++;
        }
            return count;
        }


    static boolean even(int num){
        int noOfDigits = digit(num);
        return digit(num) %2 ==0;
    }

    static int digit(int num){
        int count = 0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }
}
