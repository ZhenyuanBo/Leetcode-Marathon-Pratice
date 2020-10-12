BFS:
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null) return node;
        
        Map<Node, Node> map = new HashMap<>();
        map.put(node, new Node(node.val, new ArrayList<>()));
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        
        while(!queue.isEmpty()){
            Node topNode = queue.poll();
            for(Node nei: topNode.neighbors){
                if(!map.containsKey(nei)){
                    map.put(nei, new Node(nei.val, new ArrayList<>()));
                    queue.add(nei);
                }
                map.get(topNode).neighbors.add(map.get(nei));
            }
        }
        
        return map.get(node);
    }
}