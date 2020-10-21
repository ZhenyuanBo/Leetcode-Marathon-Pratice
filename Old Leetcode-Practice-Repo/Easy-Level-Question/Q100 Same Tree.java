/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean isSame = false;
        
        if(p == null && q == null) return true;
        
        if(p==null && q!=null || p!=null && q==null || p.val != q.val){
            return false;
        }
        
        if(isSameTree(p.left,q.left) && isSameTree(p.right,q.right)){
            isSame = true;
        }
        
        return isSame;
    }
}