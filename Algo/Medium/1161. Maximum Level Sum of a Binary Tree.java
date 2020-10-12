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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<>();
        
        q.add(root);
        
        int level=1;

        while(!q.isEmpty()){
            int size = q.size();
            int sum=0;
            for(int i=0; i<size; i++){
                TreeNode node = q.poll();
                sum += node.val;
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            map.put(level, sum);
            level++;
        }
        
        int max = Integer.MIN_VALUE;
        
        for(Integer val: map.values()){
            if(val>=max) max = val;
        }
        
        int res=1;
        
        for(Integer key: map.keySet()){
            if(map.get(key) == max){
                res = key;
                break;
            }
        }
        
        return res;
    }
}