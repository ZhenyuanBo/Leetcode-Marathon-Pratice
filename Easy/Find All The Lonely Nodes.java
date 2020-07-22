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
    public List<Integer> getLonelyNodes(TreeNode root) {
        List<Integer> lonelyNodeList = new ArrayList<>();
        helper(root, lonelyNodeList);
        return lonelyNodeList;
    }
    private TreeNode helper(TreeNode root, List<Integer> list){
        if(root==null) return null;
        
        TreeNode leftNode = helper(root.left, list);
        TreeNode rightNode = helper(root.right, list);
        
        if(leftNode==null && rightNode!=null){
            list.add(rightNode.val);
        }else if(leftNode!=null && rightNode==null){
            list.add(leftNode.val);
        }
        
        return root;
    }
}