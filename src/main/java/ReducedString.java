import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Richa Ojha on 8/1/2016.
 */
public class ReducedString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        int[] charCount = new int[26];
        char[] inputToChar = inputString.toCharArray();
        for (int i = 0; i < inputToChar.length; i++) {
            charCount[inputToChar[i] - 'a'] = charCount[inputToChar[i] - 'a'] + 1;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0, num = 97; i < charCount.length; i++, num++) {
            if (charCount[i] % 2 != 0) {
                stringBuilder.append(Character.toChars(num));
            }
        }
        if (stringBuilder.length() > 0) {
            System.out.println(stringBuilder.toString());
        } else {
            System.out.println("Empty String");
        }
    }
}
