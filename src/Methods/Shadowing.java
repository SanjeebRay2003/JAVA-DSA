package Methods;

public class Shadowing {

    static int a = 10; // this property will shadowed at line 14
    static void show(int a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        System.out.println(a);
        show(a);

        int a = 100;
        System.out.println(a);
        show(a);

    }

}
