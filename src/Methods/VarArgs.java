package Methods;

import java.util.Arrays;

public class VarArgs {

    static int add(int... arr) {
        int result = 0;
        for (int e : arr) {
            result += e;
        }
        System.out.println(Arrays.toString(arr));
            return result;
    }

    public static void main(String[] args) {

        System.out.println(add(45,78,548,56,84));

    }

}
