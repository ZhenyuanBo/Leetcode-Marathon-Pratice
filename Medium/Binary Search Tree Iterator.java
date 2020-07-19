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
class BSTIterator {
    
    private Stack<TreeNode> s;
    
    public BSTIterator(TreeNode root) {
        this.s = new Stack<TreeNode>();
        this.populateStack(root);
    }
    
    /** @return the next smallest number */
    public int next() {
        TreeNode node = s.pop();
        return node.val;  
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !s.isEmpty();
    }
    
    private void populateStack(TreeNode root){
        if(root==null) return;
        if(root.right==null && root.left==null){
            this.s.push(root);
            return;
        }
        
        if(root.right!=null) populateStack(root.right); 
        
        this.s.push(root);

        if(root.left!=null) populateStack(root.left);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */