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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) return res;
        
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        boolean rightLeft = false;
   
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> currList = new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode node = queue.poll();
                if(rightLeft){
                    currList.add(0, node.val);
                }else{
                    currList.add(node.val);
                }
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
            if(rightLeft) rightLeft = false;
            else rightLeft = true;
            res.add(currList);
        }
        
        return res;
        
    }
}