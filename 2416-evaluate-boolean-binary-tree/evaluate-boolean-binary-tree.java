/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public boolean evaluateTree(TreeNode root) {
        if (root.left == null || root.right == null) {
            return root.val == 0 ? false : true;
        }
        return getEvaluateTree(root);
    }

    public boolean getEvaluateTree(TreeNode root) {
        if (root.left == null || root.right == null) {
            return root.val == 0 ? false : true;
        }
        int rootVal = root.val;
        boolean leftNode = getEvaluateTree(root.left);
        boolean rightNode = getEvaluateTree(root.right);
        if (rootVal == 2) {
            return leftNode || rightNode;
        } else {
            return leftNode && rightNode;
        }

    }
}