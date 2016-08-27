import java.util.Scanner;

/**
 * Created by Richa Ojha on 7/29/2016.
 */
public class JumpingCloudRevisited {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalClouds = scanner.nextInt();
        int jumpingDistance = scanner.nextInt();
        int[] clouds = new int[totalClouds + 1];
        int energyLevel = 0;
        for (int i = 0; i < totalClouds; i++) {
            clouds[i] = scanner.nextInt();
        }
        clouds[clouds.length - 1] = clouds[0];
        for (int i = 0; i <= totalClouds; i += 2) {
            if (i + jumpingDistance == 1) {
                energyLevel += 2;
            } else {
                energyLevel++;
            }
        }
        System.out.println(energyLevel);

    }
}
