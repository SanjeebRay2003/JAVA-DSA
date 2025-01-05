package Arrays;

public class Array {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        System.out.println(numbers[3]);

        for (int e:numbers){
            System.out.print(e+" ");
        }


    }
}
