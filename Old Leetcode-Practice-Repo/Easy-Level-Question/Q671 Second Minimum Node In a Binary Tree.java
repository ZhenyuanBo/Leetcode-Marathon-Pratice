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
    public int findSecondMinimumValue(TreeNode root) {
        String nodeValStr = valStrForm(root);
        
        int[] valueArray = new int[nodeValStr.length()];
        int i=0;
        
        for(char ch: nodeValStr.toCharArray()){
            valueArray[i] = ch-'0';
            i++;
        }
        
        Arrays.sort(valueArray);
        
        int firstMin = valueArray[0];
        
        for(int j: valueArray){
            if(j>firstMin) return j;
        }
        
        return -1;

    }
    private String valStrForm(TreeNode root){

    	if(root == null) return "";

    	String str = Integer.toString(root.val);

    	str += valStrForm(root.left);

    	str += valStrForm(root.right);

    	return str;
    }
}