package Searching.Practice;

public class Q6 {
    public static void main(String[] args) {
        int[][] marks = {
                {45,86,78,54,68,45},
                {78,85,96,84},
                {96,87,88,99}
        };

        int target = 78;
        System.out.println(search(marks,target));
    }

    static int search(int[][] marks,int target){
        for (int i = 0;i<marks.length;i++){
            for (int j =0;j<marks[i].length;j++){
                if (j == target){
                    return j;
                }
            }
        }
        return -1;
    }
}
