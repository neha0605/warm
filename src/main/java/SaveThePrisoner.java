import java.util.Scanner;

/**
 * Created by Richa Ojha on 7/28/2016.
 */
public class SaveThePrisoner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while (testCases-- > 0) {
            int totalprisoner = scanner.nextInt();
            int sweets = scanner.nextInt();
            int startingId = scanner.nextInt();

            for (int i = startingId; i <= totalprisoner && sweets > 0; i++) {
                sweets--;
                if (sweets == 0) {
                    System.out.println(i);
                }
            }
            if (sweets != 0) {
                for (int i = 1; i < startingId; i++) {
                    sweets--;
                    if (sweets == 0) {
                        System.out.println(i);
                    }
                }
            }

        }

    }
}
