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
    public List<List<Integer>> verticalOrder(TreeNode root) {
        //store column index and list of nodes on the same col
        TreeMap<Integer, List<Integer>> colTable = new TreeMap<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) return res;
        
        Queue<Pair<TreeNode, Integer>> queue = new LinkedList<>();
        int column=0;
        queue.add(new Pair(root, column));
        
        while(!queue.isEmpty()){
            Pair<TreeNode,Integer> topPair = queue.poll();
            TreeNode node = topPair.getKey();
            int col = topPair.getValue();
            if(!colTable.containsKey(col)){
                List<Integer> list = new ArrayList<>();
                list.add(node.val);
                colTable.put(col, list);
            }else{
                List<Integer> currList = colTable.get(col);
                currList.add(node.val);
                colTable.put(col, currList);
            }
            if(node.left!=null) queue.add(new Pair(node.left, col-1));
            if(node.right!=null) queue.add(new Pair(node.right, col+1));
        }
        
        for(Integer colIndex: colTable.keySet()){
            res.add(colTable.get(colIndex));
        }
        
        return res;
    }
}
//use hashmap store the col index and sort col index from smallest to largest (use TreeMap)