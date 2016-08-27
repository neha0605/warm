import java.util.Scanner;

/**
 * Created by Richa Ojha on 7/27/2016.
 */
public class CompareTheTriplets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] alice = new int[3];
        int[] bob = new int[3];
        int alicePoints = 0;
        int bobPoints = 0;
        for (int i = 0; i < 3; i++) {
            alice[i] = scanner.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            bob[i] = scanner.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            if (alice[i] > bob[i]) {
                alicePoints++;
            } else if (alice[i] < bob[i]) {
                bobPoints++;
            }
        }
        System.out.println(alicePoints + " " + bobPoints);
    }
}
