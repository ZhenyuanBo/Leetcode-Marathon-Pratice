/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> resList = new ArrayList<>();
        if(root==null) return resList;
        
        List<Integer> list = helper(root);
        
        while(!list.isEmpty()){
            resList.add(list);
            if (list.get(0) == root.val) {
                break;
            }
            list = helper(root);
        }
        
        return resList;
    }
    private List<Integer> helper(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        List<Integer> leafList = new ArrayList<>();
        if(isLeaf(root)){
            leafList.add(root.val);
            return leafList;
        }
        
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            if(node.left!=null){
                if(isLeaf(node.left)){
                    leafList.add(node.left.val);
                    node.left = null;
                }else{
                    q.add(node.left);
                }
            }
            if(node.right!=null){
                if(isLeaf(node.right)){
                    leafList.add(node.right.val);
                    node.right = null;
                }else{
                    q.add(node.right);
                }
            }
        }
        
        return leafList;
    }
    private boolean isLeaf(TreeNode root){
        if(root.left==null && root.right==null) return true;
        return false;
    }
}