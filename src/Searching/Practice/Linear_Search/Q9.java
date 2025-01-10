package Searching.Practice.Linear_Search;

public class Q9 {
    public static void main(String[] args) {

        int[][] accounts = {
                {4,2,3},
                {3,2,1},
                {4,5,2},
                {5,0,4}
        };

        int maxWealth = maximumWealth(accounts);
        System.out.println(maxWealth);
    }

    static int maximumWealth(int[][] accounts) {

        int ans = Integer.MIN_VALUE;
        for ( int i = 0;i<accounts.length;i++){
            int sum = 0;
            for (int j = 0;j<accounts[i].length;j++){
                sum += accounts[i][j];
            }
            if (sum>ans){
                ans = sum;
            }
        }
        return ans;
    }
}
