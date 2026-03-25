import java.util.ArrayList;
import java.util.List;

public class KthSmallestInBST {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public void traverse(TreeNode root, List<Integer> ls) {
        if (root == null) {
            return;
        }
        traverse(root.left, ls);
        ls.add(root.val);
        traverse(root.right, ls);
    }

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> ls = new ArrayList<>();
        traverse(root, ls);
        return ls.get(k - 1);
    }
}
