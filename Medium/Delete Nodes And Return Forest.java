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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
       List<TreeNode> list = new ArrayList<>();
       Set<Integer> set = new HashSet<>();
       for(int i=0; i<to_delete.length; i++){
           set.add(to_delete[i]);
       }
       delete(root, set, false, list);
       return list;
    }
    private TreeNode  delete(TreeNode root, Set<Integer> set, boolean connected, List<TreeNode> list){
        if(root==null) return null;
        
        if(set.contains(root.val)){
            delete(root.left, set, false, list);
            delete(root.right, set, false, list);
            root = null;
        }else{
            if(!connected) list.add(root);
            root.left = delete(root.left, set, true, list);
            root.right = delete(root.right, set, true, list);
        }
        return root;
    }
}