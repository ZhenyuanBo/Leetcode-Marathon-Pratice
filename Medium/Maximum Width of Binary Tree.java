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
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        
        Queue<Pair<TreeNode, Integer>> queue = new LinkedList<>();
        queue.add(new Pair<>(root, 0));
        
        int maxWidth = Integer.MIN_VALUE;
        
        while(!queue.isEmpty()){
            int size = queue.size();
            Pair<TreeNode, Integer> head = queue.peek();
            
            int index=-1;
            
            for(int i=0; i<size; i++){
                Pair<TreeNode, Integer> nodePair = queue.poll();
                TreeNode node = nodePair.getKey();
                index = (int)nodePair.getValue();
                if(node.left!=null){
                    queue.add(new Pair<>(node.left, 2*index));
                }
                if(node.right!=null){
                    queue.add(new Pair<>(node.right, 2*index+1));
                }
            }
            
            maxWidth = Math.max(maxWidth, index-head.getValue() + 1);
        }
        
        return maxWidth;
    }
}