import java.util.Scanner;

/**
 * Created by Richa Ojha on 8/4/2016.
 */
public class CamelCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                count++;
            }
        }
        System.out.println(count);
    }
}
