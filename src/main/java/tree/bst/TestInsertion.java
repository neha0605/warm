package tree.bst;

/**
 * Created by Richa Ojha on 8/3/2016.
 */
public class TestInsertion {
    public static void main(String[] args) {
        int[] input = {3, 4, 1, 2, 5};
        BSTNode root = null;
        for (int i = 0; i < input.length; i++) {
            InsertionUtil.insert(root, input[i]);
        }
    }
}
