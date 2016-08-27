import java.util.Scanner;

/**
 * Created by Richa Ojha on 8/4/2016.
 */
public class MarsExpolaration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int count = 0;
        System.out.println(str.length());
        if (str.length() % 3 == 0) {
            for (int i = 0; ; i+=3) {
                if(str.contains("SOS")){
                    continue;
                }
            }
        }
        System.out.println(count);
    }
}
