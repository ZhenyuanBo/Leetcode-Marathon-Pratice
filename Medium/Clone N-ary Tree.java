/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    
    public Node() {
        children = new ArrayList<Node>();
    }
    
    public Node(int _val) {
        val = _val;
        children = new ArrayList<Node>();
    }
    
    public Node(int _val,ArrayList<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public Node cloneTree(Node root) {
        
        Map<Node, Node> map = new HashMap<Node, Node>();
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; i++){
                Node node = queue.poll();
                Node cloneNode = map.getOrDefault(node, new Node(node.val));
                for(Node child : node.children){
                    Node cloneChild = map.getOrDefault(child, new Node(child.val));
                    cloneNode.children.add(cloneChild);
                    queue.add(child);
                    map.put(child, cloneChild);
                }
                map.put(node, cloneNode);
            }
        }
        
        return map.get(root);
    }
}