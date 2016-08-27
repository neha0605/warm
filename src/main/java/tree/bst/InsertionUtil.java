package tree.bst;

/**
 * Created by Richa Ojha on 8/3/2016.
 */
public class InsertionUtil {

    public static void insert(BSTNode root, int num) {
        if (root == null) {
            root = new BSTNode(num);
            return;
        }
        BSTNode node = root;
        while (true) {
            if (num < node.data) {
                if (node.left != null) {
                    node.left = new BSTNode(num);
                    break;
                }
                node = node.left;
            } else {
                if (node.data > num) {
                    if (node.right != null) {
                        node.right = new BSTNode(num);
                        break;
                    }
                    node = node.right;
                }
            }
        }
    }
}
