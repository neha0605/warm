package tree;

/**
 * Created by Richa Ojha on 8/3/2016.
 */
public class TreeHeight {

    public static int height(Node root, int height) {
        if (root == null) {
            return 0;
        }
        int left = height(root.left, height + 1);
        int right = height(root.right, height + 1);
        return Math.max(left, right);
    }
}
