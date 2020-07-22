class Solution {
    public TreeNode increasingBST(TreeNode root) {
        //create a sentinel node
        TreeNode sentinel = new TreeNode(0);
        TreeNode curr = sentinel;
        List<TreeNode> list = new ArrayList<>();
        updateList(root, list);
        for(TreeNode node: list){
            curr.right = new TreeNode(node.val);
            curr = curr.right;
        }
        
        return sentinel.right;
    }
    private void updateList(TreeNode root, List<TreeNode> list){
        if(root==null) return;
        
        updateList(root.left, list);
        
        list.add(root);
        
        updateList(root.right, list);
    }
    
}

//set up a sentinel node