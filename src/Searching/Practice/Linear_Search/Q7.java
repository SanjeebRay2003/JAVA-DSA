package Searching.Practice.Linear_Search;

// Q. find maximum and minimum value of element in 2D array
public class Q7 {
    public static void main(String[] args) {
        int[][] marks = {
                {45,86,54,68,45},
                {78,85,96,84},
                {96,87,88,99}
        };
        int max = maxMarks(marks);
        int min = minMarks(marks);
        System.out.println("max = "+max);
        System.out.println("min = "+min);
    }

    // Returns maximum value of element
    static int maxMarks(int[][] marks){
        int max = Integer.MIN_VALUE;
        for (int i = 0;i<marks.length;i++){
            for (int j =0;j<marks[i].length;j++){
                if (marks[i][j] > max){
                    max = marks[i][j];
                }
            }
        }
        return max;
    }
    static int minMarks(int[][] marks){
        int min = Integer.MAX_VALUE;
        for (int i = 0;i<marks.length;i++){
            for (int j =0;j<marks[i].length;j++){
                if (marks[i][j] < min){
                    min = marks[i][j];
                }
            }
        }
        return min;
    }

}
