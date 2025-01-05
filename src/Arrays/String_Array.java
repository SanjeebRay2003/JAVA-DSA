package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class String_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] name = new  String[5];
        for (int i = 0;i< name.length;i++){
            name[i] = input.next();
        }

        System.out.println(Arrays.toString(name));

//        for (String N : name){
//            System.out.print(N+ " ");
//        }
    }
}
