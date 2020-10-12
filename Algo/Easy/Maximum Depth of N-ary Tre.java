/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public int maxDepth(Node root) {
        if(root==null) return 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int depth=0;
        while(!queue.isEmpty()){
            depth++;
            int size = queue.size();
            for(int i=0; i<size; i++){
                Node node = queue.poll();
                List<Node> neiNodes = node.children;
                if(neiNodes.size()>0){
                    for(Node nei: neiNodes){
                        queue.add(nei);
                    }
                }
            }
        }
        return depth;
    }
}