package codingBat;

import java.util.Arrays;
import java.util.Locale;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Array1 {
    public static void main(String[] args) {
        int a[] = {5,6,8,9,18,7};
        int sum = Arrays.stream(a).sum();
        for (int i = 0; i < a.length; i++) {

        }
        System.out.println(sum);
//        OptionalInt max = Arrays.stream(a).max();
//        System.out.println(max.getAsInt());

    }


//    public void array(int[] a, int[] b) {
//        int[] result = new int[2];
//        result[0] = a[1];
//        result[1] = b[1];
//        return result;
//    }
}
