package Methods.Practice;

public class Q1 {
    public static void main(String[] args) {
        String name = "Sanjeeb";
        System.out.println(changeName(name));
        System.out.println(name);
    }

     static String changeName(String naam) {
        naam = "Rajdeep";
        return naam;
    }
}
