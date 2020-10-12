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
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        //we need to check both descendents and the parent nodes
        List<Integer> list = new ArrayList<>();
        Map<TreeNode, TreeNode> parents = new HashMap<>();
        dfs(root, null, parents);
        
        Set<TreeNode> visited = new HashSet<>();
        
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(target);
        
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                TreeNode node = q.poll();
                if(node==null || !visited.add(node)) continue;
                if(K==0){
                    list.add(node.val);
                    continue;
                }
                q.add(node.left);
                q.add(node.right);
                q.add(parents.get(node));
            }
            K--;
        }
        
        return list;
        
    }
    
    private void dfs(TreeNode node, TreeNode prev, Map<TreeNode, TreeNode> parents){
        if(node==null) return;
        parents.put(node, prev);
        dfs(node.left, node, parents);
        dfs(node.right, node, parents);
    }
}