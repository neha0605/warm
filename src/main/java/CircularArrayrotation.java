import sun.plugin.javascript.navig.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Richa Ojha on 7/27/2016.
 */
public class CircularArrayrotation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int rotation = scanner.nextInt();
        int queries = scanner.nextInt();
        int[] query = new int[queries];
        int[] elements = new int[size];
        int[] output = new int[size];
        for (int i = 0; i < size; i++) {
            elements[i] = scanner.nextInt();
        }
        for (int i = 0; i < queries; i++) {
            query[i] = scanner.nextInt();
        }
        int index = 0;
        for (int i = size - rotation; i < size; i++) {
            output[index] = elements[i];
            index++;
        }
        for (int i = 0; i < size - rotation; i++) {
            output[index] = elements[i];
            index++;
        }

//        System.out.println(Arrays.toString(output));
        for (int i = 0; i < query.length; i++) {
            System.out.println(output[query[i]]);
        }
    }
}
