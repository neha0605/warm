/**
 * Created by Richa Ojha on 8/2/2016.
 */
public class TestException {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            try {
                if (i % 2 == 0) {
                    count++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Total time taken = " + (System.currentTimeMillis() - startTime));
    }
}
