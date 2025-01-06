package Arrays.Array_List.Practice;

// Q. WAP to search maximum value of element of an array
public class Q2 {
    public static void main(String[] args) {
        int[] array = {200, 20, 30,60, 40, 50, 1000,400};

        System.out.println(maxValue(array)); // max value

    }

    // Return the maximum value of elements
    static int maxValue(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}
