import java.util.Scanner;

/**
 * Created by Richa Ojha on 7/28/2016.
 */
public class JumpingOnTheClouds {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] elements = new int[size];
        for (int i = 0; i < size; i++) {
            elements[i] = scanner.nextInt();
        }
        int steps = 0;
        for (int i = 0; i < size-1; ) {
            if (i + 2 < size && elements[i + 2] != 1) {
                i += 2;
                steps++;
            } else {
                i++;
                steps++;
            }
        }
        System.out.println(steps);
    }
}
