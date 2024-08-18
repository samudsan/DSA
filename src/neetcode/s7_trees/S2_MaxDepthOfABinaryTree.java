package neetcode.s7_trees;

import data_structues.trees.BinaryTree;
import data_structues.trees.TreeNode;

public class S2_MaxDepthOfABinaryTree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        TreeNode node = tree.createBinaryTree(new int[]{3,9,20, Integer.parseInt(null), Integer.parseInt(null),15,7});
        tree.levelOrder(node);
        System.out.println();
        int maxDepth = maxDepth(node);
        System.out.println("max Depth is : "+ maxDepth);
    }
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        // Recursively find the depth of the left and right subtrees
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        // Return the greater depth plus one for the current node
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
