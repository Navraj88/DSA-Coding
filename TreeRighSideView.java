import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class TreeRighSideView {
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
    public List<Integer> rightSideView(TreeNode root) {
       List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null){
            return ans;
        }
        q.offer(root);
        while(!q.isEmpty()){
            int temp=0;
            int n= q.size();
            while(n!=0){
                TreeNode front=q.poll();
                temp=front.val;
                if(front.left!=null) q.offer(front.left);
                if(front.right!=null) q.offer(front.right);
                n--;
            }
            ans.add(temp);
        }
        return ans; 
    }
}
