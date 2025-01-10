package Searching.Practice.Linear_Search;

public class Q10 {
    public static void main(String[] args) {
        int x = 8;
        System.out.println(mySqrt(x));

    }

    static int mySqrt(int x){
       int a = x;
       if (x<0){
           return 0;
       }
       int num = 1;
        for (int i = 1; i < x; i++) {
            if (i * i == x){
                num =  i;
                return  num;
            }
        }
        return Math.round(num);
    }
}
