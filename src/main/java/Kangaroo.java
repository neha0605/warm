import java.util.Scanner;

/**
 * Created by Richa Ojha on 7/27/2016.
 */
public class Kangaroo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstKangrooLocation = scanner.nextInt();
        int firstKangrooJumpingRate = scanner.nextInt();
        int secondKangrooLocation = scanner.nextInt();
        int secondKangrooJumpingRate = scanner.nextInt();
        if (firstKangrooLocation < secondKangrooLocation && firstKangrooJumpingRate > secondKangrooJumpingRate) {
            int relativeSpeed = firstKangrooJumpingRate - secondKangrooJumpingRate;
            int locationDifference = secondKangrooLocation - firstKangrooLocation;
            if (locationDifference % relativeSpeed == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}
