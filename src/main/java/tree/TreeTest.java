package tree;

/**
 * Created by Richa Ojha on 8/1/2016.
 */
public class TreeTest {

    public static void main(String[] args) {
        Node root = getTestTree();
        int height = TreeHeight.height(root, 0);
        System.out.println(height);
    }

    public static Node getTestTree() {

        Node node = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);
        Node node5 = new Node(6);
        Node node6 = new Node(7);
        Node node7 = new Node(8);
        Node node8 = new Node(9);

        node.left = node1;
        node.right = node2;
        node2.right = node3;
        node1.left = node4;
        node3.right = node5;
        node4.left = node6;
        node5.right = node7;
        node5.left = node8;

        return node;
    }
}
