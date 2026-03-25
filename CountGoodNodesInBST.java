
public class CountGoodNodesInBST {
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
    public int checkGood(TreeNode root, int nodeMax){
        if(root==null){
            return 0;
        }
        int temp=0;
        // checked if current node value is gretaer than or equal to previous max vals
        if(root.val>=nodeMax){
            temp+=1;
        }
        nodeMax=Math.max(nodeMax,root.val);
        int left=checkGood(root.left,nodeMax);
        int right=checkGood(root.right,nodeMax);
        return temp+left+right;
    }
    public int goodNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        int nodeMax=root.val;
        return checkGood(root,nodeMax);
    }
}
