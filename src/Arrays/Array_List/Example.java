package Arrays.Array_List;

import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(200);
        list1.add(300);
        list1.add(400);
        list1.add(500);
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(100);
        list2.add(300);
        list2.add(1000);
        list2.add(2000);
        list2.add(3000);
        System.out.println(list2);

//        list1.retainAll(list2);
//        System.out.println(list1);

        list1.addAll(list2);
        System.out.println(list1);

        list1.removeAll(list2);
        System.out.println(list1);




    }
}
