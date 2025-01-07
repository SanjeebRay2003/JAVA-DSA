package Searching.Practice;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        String name = "Sanjeeb";
        char target = 'n';
        System.out.println( isPresent(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println("Present at index "+Search(name,target));
    }

    static Boolean isPresent(String str,char target){
        if (str.length() == 0){
            return false;
        }

        for (char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
    static int Search(String str,char target){
        if (str.length() == 0){
            return -1;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)){
                return i;
            }
        }
        return -1;
    }

}
