package tree;

/**
 * Created by Richa Ojha on 8/1/2016.
 */
public class TreeUtil {

    public static void top_view(Node root) {
        if (root == null) {
            return;
        }
        printLeft(root.left);
        System.out.print(root.data + " ");
        printRight(root.right);
    }

    public static void printLeft(Node node) {
        if (node == null) {
            return;
        }
        printLeft(node.left);
        System.out.print(node.data + " ");
    }

    public static void printRight(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        printRight(node.right);
    }
}
