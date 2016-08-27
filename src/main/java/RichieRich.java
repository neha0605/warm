import java.util.Scanner;

/**
 * Created by Richa Ojha on 8/23/2016.
 */
public class RichieRich {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int totalDigits=scanner.nextInt();
        int maxAlteration=scanner.nextInt();
        String input=scanner.next();
        char[] digitArray=input.toCharArray();
        int length=digitArray.length;
        while (maxAlteration-->=0){
            for (int i = 0; i < length; i++) {
                for (int j = length-1; j>=0; j--) {
                    
                }
            }
        }
    }
}
