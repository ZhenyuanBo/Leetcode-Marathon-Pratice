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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            boolean hasX = false;
            boolean hasY = false;
            for(int i=0; i<size; i++){
                TreeNode node = queue.poll();
                boolean foundX=false;
                boolean foundY=false;
                if(node.left!=null){
                    if(node.left.val==x){
                        foundX = true;
                        hasX = true;
                    }else if(node.left.val==y){
                        foundY = true;
                        hasY = true;
                    }
                    queue.add(node.left);
                }
                if(node.right!=null){
                    if(node.right.val==x){
                        foundX = true;
                        hasX = true;
                    }else if(node.right.val==y){
                        foundY = true;
                        hasY = true;
                    }
                    queue.add(node.right);
                }
                if(foundX && foundY) return false;
            }
            if(hasX && hasY) return true;
        }
        
        return false;
    }
}