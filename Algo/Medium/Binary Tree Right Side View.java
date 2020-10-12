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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<List<TreeNode>> list = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        if(root==null) return res;
                
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            List<TreeNode> currList = new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode node = queue.poll();
                currList.add(node);
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
            list.add(currList);
        }
        
        for(int i=0; i<list.size(); i++){
            List<TreeNode> curr = list.get(i);
            TreeNode rightMostNode = curr.get(curr.size()-1);
            res.add(rightMostNode.val);
        }
        
        return res;
    }
}
//solution 2
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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<List<TreeNode>> list = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        if(root==null) return res;
                
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            // List<TreeNode> currList = new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode node = queue.poll();
                // currList.add(node);
                if(i==size-1) res.add(node.val);
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
            // list.add(currList);
        }
        
        // for(int i=0; i<list.size(); i++){
        //     List<TreeNode> curr = list.get(i);
        //     TreeNode rightMostNode = curr.get(curr.size()-1);
        //     res.add(rightMostNode.val);
        // }
        
        return res;
    }
}