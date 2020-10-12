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
    public int sumEvenGrandparent(TreeNode root) {
        if(root==null) return 0;
        
        List<Integer> sumList = new ArrayList<>();
        populateMap(root, sumList);
        
        int sum=0;
        
        for(Integer i: sumList){
            sum+=i;
        }
        
        return sum;
    }
    private void populateMap(TreeNode root, List<Integer> sumList){

        if(root.val%2==0){
            int sum=0;
            if(root.left!=null){
                if(root.left.left!=null){
                    sum+=root.left.left.val;
                }
                if(root.left.right!=null){
                    sum+=root.left.right.val;
                }
            }
            if(root.right!=null){
                if(root.right.left!=null){
                    sum+=root.right.left.val;
                }
                if(root.right.right!=null){
                    sum+=root.right.right.val;
                }
            }
            sumList.add(sum);
        }
        
        if(root.left!=null){
            populateMap(root.left, sumList); 
        }
        if(root.right!=null){
            populateMap(root.right, sumList); 
        }
    }
}