import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Richa Ojha on 7/27/2016.
 */
public class EqualStack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stackOneSize = scanner.nextInt();
        Stack<Integer> stack1 = new Stack<>();

        int stackTwoSize = scanner.nextInt();
        Stack<Integer> stack2 = new Stack<>();

        int stackThreeSize = scanner.nextInt();
        Stack<Integer> stack3 = new Stack<>();

        int stackOneSum = 0;
        int stackTwoSum = 0;
        int stackThreeSum = 0;

        int[] array1 = new int[stackOneSize];
        int[] array2 = new int[stackTwoSize];
        int[] array3 = new int[stackThreeSize];

        for (int i = 0; i < stackOneSize; i++) {
            array1[i] = scanner.nextInt();
        }
        for (int i = stackOneSize - 1; i >= 0; i--) {
            stack1.push(array1[i]);
            stackOneSum += stack1.peek();

        }

        for (int i = 0; i < stackTwoSize; i++) {
            array2[i] = scanner.nextInt();
        }
        for (int i = stackTwoSize - 1; i >= 0; i--) {
            stack2.push(array2[i]);
            stackTwoSum += stack2.peek();
        }

        for (int i = 0; i < stackThreeSize; i++) {
            array3[i] = scanner.nextInt();
        }
        for (int i = stackThreeSize - 1; i >= 0; i--) {
            stack3.push(array3[i]);
            stackThreeSum += stack3.peek();
        }

        if (stackOneSum == stackTwoSum && stackOneSum == stackThreeSum) {
            System.out.println(stackOneSum);
        } else {
            while (stackOneSum != stackTwoSum && stackOneSum != stackThreeSum) {
                if (stackOneSum < stackTwoSum && stackOneSum < stackThreeSum) {
                    int num1 = stack2.pop();
                    int num2 = stack3.pop();
                    stackTwoSum = stackTwoSum - num1;
                    stackThreeSum = stackThreeSum - num2;
                } else if (stackTwoSum < stackOneSum && stackTwoSum < stackThreeSum) {
                    int num1 = stack1.pop();
                    int num2 = stack3.pop();
                    stackOneSum = stackOneSum - num1;
                    stackThreeSum = stackThreeSum - num2;
                } else if (stackThreeSum < stackOneSum && stackThreeSum < stackTwoSum) {
                    int num1 = stack1.pop();
                    int num2 = stack2.pop();
                    stackOneSum = stackOneSum - num1;
                    stackTwoSum = stackTwoSum - num2;
                } else if (stackOneSum < stackTwoSum && stackOneSum == stackThreeSum) {
                    int num1 = stack2.pop();

                    stackTwoSum = stackTwoSum - num1;
                } else if (stackOneSum == stackTwoSum && stackTwoSum < stackThreeSum) {

                    int num2 = stack3.pop();
                    stackThreeSum = stackThreeSum - num2;
                } else if (stackThreeSum == stackTwoSum && stackThreeSum < stackOneSum) {
                    int num1 = stack1.pop();

                    stackOneSum = stackOneSum - num1;
                }
            }
        }

        System.out.println(stackOneSum);
    }
}
