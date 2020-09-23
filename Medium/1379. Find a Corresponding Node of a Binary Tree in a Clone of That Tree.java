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
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {

        //searching can use BFS
        Queue<TreeNode> q  = new LinkedList<>();
        q.add(original);
        q.add(cloned);
        
        TreeNode res = null;
        
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size;){
                TreeNode node1 = q.poll();
                TreeNode node2 = q.poll();
                if(node1.val == target.val){
                    res = node2;
                    break;
                }
                
                if(node1.left!=null){
                    q.add(node1.left);
                }
                
                if(node2.left!=null){
                    q.add(node2.left);
                }
                
                if(node1.right!=null){
                    q.add(node1.right);
                }
                
                if(node2.right!=null){
                    q.add(node2.right);
                }
                
                i+=2;
            }
            
            if(res!=null) break;
        }
        
        return res;
    }
}