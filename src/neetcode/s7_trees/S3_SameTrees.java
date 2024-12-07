package neetcode.s7_trees;

import data_structues.trees.BinaryTree;
import data_structues.trees.TreeNode;

public class S3_SameTrees {
    public static boolean isSameTree(TreeNode p, TreeNode q){
        // Both trees are empty
        if (p == null && q == null) {
            return true;
        }

        // One tree is empty, and the other is not
        if (p == null || q == null) {
            return false;
        }

        // Both nodes have values, check if they are the same and recursively check left and right subtrees
        return (p.value == q.value) &&
                isSameTree(p.left, q.left) &&
                isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        TreeNode root1 = tree.createBinaryTree(new int[]{1,2,1});
        TreeNode root2 = tree.createBinaryTree(new int[]{1,2,1});
        tree.levelOrder(root1);
        tree.levelOrder(root2);
        System.out.println(isSameTree(root1, root2));

    }
}
