package Methods;

import java.util.Arrays;

public class method_overloading {

    static void show(){
        System.out.println("Hello I am Sanjeeb Roy");
    }

    static void show(String a){
        System.out.println(a);
    }

    static void show(int a){
        System.out.println(a);
    }

    static void show(String ...name){
        System.out.println(Arrays.toString(name));
    }

    public static void main(String[] args) {

        show();
        show("Sanjeeb Roy");
        show(145784);
        show("aman","komal","kishan","Tanishk");

    }
}
