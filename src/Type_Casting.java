
public class Type_Casting {
    public static void main(String[] args) {

        // Implicit
        int a = 10;
        double b = a;

        System.out.println("Implicit :");
        System.out.println(a);
        System.out.println(b);

        // Explicit
        double x = 10.0;
        int y = (int) x;

        System.out.println("Explicit : ");
        System.out.println(x);
        System.out.println(y);

    }
}