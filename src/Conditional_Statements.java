import java.util.Scanner;

public class Conditional_Statements {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Marks : ");
        int marks = input.nextInt();

        if (marks > 80){
            System.out.println("Pass, Grade A");
        } else if (marks > 70) {
            System.out.println("Pass, Grade B");
        } else if (marks > 60) {
            System.out.println("Pass, Grade C");
        } else {
            System.out.println("fail");
            }


    }
}
