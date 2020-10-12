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
    public boolean isSymmetric(TreeNode root) {
       Queue<TreeNode> queue = new LinkedList<>();
       queue.add(root);
       
       while(!queue.isEmpty()){
           int size = queue.size();
           if(!helper(queue)) return false;
           for(int i=0; i<size; i++){
               TreeNode node = queue.poll();
               if(node!=null){
                   if(node.left!=null) queue.add(node.left);
                   else
                       queue.add(null);
                   if(node.right!=null) queue.add(node.right);
                   else
                       queue.add(null);
               }
           }
       }
        
       return true;
    }
    private boolean helper(Queue<TreeNode> queue){
        List<TreeNode> list = new ArrayList<>();
        Iterator<TreeNode> it = queue.iterator();
        
        while(it.hasNext()){
            list.add(it.next());
        }
        
        int i=0, j=list.size()-1;
        
        while(i<j){
            if(list.get(i)==null && list.get(j)!=null || 
               list.get(i)!=null && list.get(j)==null) return false;
            if(list.get(i)!=null && list.get(j)!=null && 
               list.get(i).val!=list.get(j).val) return false;
            i++;
            j--;
        }
        
        return true;
    }
}

//solution 2:
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
    public boolean isSymmetric(TreeNode root) {
       Queue<TreeNode> queue = new LinkedList<>();
       queue.add(root);
       queue.add(root);
    
       while(!queue.isEmpty()){
           int size = queue.size();
           for(int i=0; i<size; i++){
               
               TreeNode node1 = queue.poll();
               TreeNode node2 = queue.poll();
               if(node1==null && node2==null) continue;
               if(node1==null || node2==null) return false;
               if(node1.val != node2.val) return false;
   
               queue.add(node1.left);
               queue.add(node2.right);
               queue.add(node1.right);
               queue.add(node2.left);
               
           }
       }
        
       return true;
    }
}