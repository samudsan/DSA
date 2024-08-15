package data_structues.trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    public TreeNode createBinaryTree(int[] arr) {
        return insertLevelOrder(arr, 0);
    }
    private TreeNode insertLevelOrder(int[] arr, int i) {
        TreeNode root = null;
        // Base case for recursion
        if (i < arr.length) {
            root = new TreeNode(arr[i]);

            // Insert left child
            root.left = insertLevelOrder(arr, 2 * i + 1);

            // Insert right child
            root.right = insertLevelOrder(arr, 2 * i + 2);
        }
        return root;
    }

    // In-order traversal for testing
    public void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.value + " ");
            inOrder(root.right);
        }
    }

    // Level order traversal method
    public void levelOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            // Remove the front of the queue
            TreeNode node = queue.poll();
            System.out.print(node.value + " ");

            // Add the left child to the queue
            if (node.left != null) {
                queue.add(node.left);
            }

            // Add the right child to the queue
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        TreeNode root = tree.createBinaryTree(arr);
        // Print the tree in in-order traversal
        tree.levelOrder(root);  // Output: 1 4 2 5 6 3 7

    }
}
