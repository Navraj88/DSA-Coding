
public class DiameterOfBinaryTree {
         public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
    int mx = 0;
    int solve(TreeNode root){
        if(root == null) return 0;
        int l = solve(root.left), r = solve(root.right);
        mx = Math.max(mx, l + r);
        return 1 + Math.max(l, r);
    }
    int diameterOfBinaryTree(TreeNode root) {
        solve(root);
        return mx;
    }
}
