import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Richa Ojha on 8/1/2016.
 */
public class ArrayLeftRotation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int rotation = scanner.nextInt();
        int[] output = new int[size];
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int index = 0;
        for (int i = rotation; i < size; i++) {
            output[index] = array[i];
            index++;
        }
        for (int i = 0; i < rotation; i++) {
            output[index] = array[i];
            index++;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(output[i] + " ");
        }
    }
}
