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
    public TreeNode str2tree(String s) {
        return dfs(s);
    }
    private TreeNode dfs(String s){
        int size = s.length();
        if(size==0) return null;
        
        int position = s.indexOf("(");
        if(position==-1) return new TreeNode(Integer.valueOf(s));
        
        TreeNode node = new TreeNode(Integer.valueOf(s.substring(0, position)));
        
        int count=0;
        
        for(int i=position; i<size; i++){
            if(s.charAt(i)=='('){
                count++;
            }else if(s.charAt(i)==')'){
                count--;
            }
            
            if(count==0){
                node.left = dfs(s.substring(position+1, i));
                if(i!=size-1){
                    node.right = dfs(s.substring(i+2, size-1));
                }
                
                break;
            }
        }
        
        return node;
    }
}