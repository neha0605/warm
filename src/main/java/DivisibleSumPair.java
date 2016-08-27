import java.util.Scanner;

/**
 * Created by Richa Ojha on 7/28/2016.
 */
public class DivisibleSumPair {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int divisor = scanner.nextInt();
        int[] elements = new int[size];
        for (int i = 0; i < size; i++) {
            elements[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i+1; j < size; j++) {
                if ((elements[i] + elements[j]) % divisor == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
