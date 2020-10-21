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
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> valueSet = new HashSet<Integer>();
        return finderTargetHelper(root, valueSet, k);
    }
    
    private boolean finderTargetHelper(TreeNode root, Set<Integer> rootValSet, int k){
        if(root == null) return false;
        if(rootValSet.contains(k-root.val)) return true;
        
        rootValSet.add(root.val);
        
        boolean leftFinder = finderTargetHelper(root.left, rootValSet, k);
        boolean rightFinder = finderTargetHelper(root.right, rootValSet, k);
        
        if(leftFinder || rightFinder) return true;
        
        return false;
    }

}