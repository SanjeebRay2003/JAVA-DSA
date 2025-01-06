package Arrays.Array_List.Practice;

// Q. WAP to search maximum value of elements in a range
public class Q3 {
    public static void main(String[] args) {

        int[] num = {45, 78, 69, 45, 84, 25, 44, 11, 52, 100, 412, 120};
        System.out.println(maxInRange(num, 1, 4)); // max value in range
    }

    // Return the maximum value of elements of range
    static int maxInRange(int[] arr, int start, int end) {
        int maxInRange = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxInRange) {
                maxInRange = arr[i];
            }
        }
        return maxInRange;
    }
}
