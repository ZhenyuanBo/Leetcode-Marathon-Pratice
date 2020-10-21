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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ansList = new ArrayList<List<Integer>>();
        levelOrderBuilder(ansList, root, 0);
        return ansList;
    }
    private void levelOrderBuilder(List<List<Integer>> list, TreeNode root, int level){
        if(root == null) return;
        if(level>=list.size()){
            list.add(0, new ArrayList<Integer>());
        }
        levelOrderBuilder(list, root.left, level+1);
        levelOrderBuilder(list, root.right, level+1);
        list.get(list.size()-level-1).add(root.val);
        return ;
    }
}