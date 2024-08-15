package neetcode.s7_trees;

import data_structues.trees.TreeNode;
import data_structues.trees.BinaryTree;

public class S1_InvertBinaryTree {
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        // Swap the left and right children
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Recursively invert the left and right subtrees
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        TreeNode node = tree.createBinaryTree(new int[]{4,2,7,1,3,6,9});
        tree.levelOrder(node);
        System.out.println();
        TreeNode invertedBinaryTree = invertTree(node);
        tree.levelOrder(invertedBinaryTree);

    }
}
