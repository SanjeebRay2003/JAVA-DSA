package Arrays.Array_List;

import java.util.ArrayList;
import java.util.Scanner;

public class array_list {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);

        // input elements
//        for (int i = 0;i<5;i++){
//            list.add(input.nextInt());
//        }

        // prints every elements
//        for (int i = 0;i<5;i++){
//            System.out.println(list.get(i));
//        }

        list.set(0,10000);
        list.remove(1);
        System.out.println(list.contains(300));


        System.out.println(list);


    }
}
