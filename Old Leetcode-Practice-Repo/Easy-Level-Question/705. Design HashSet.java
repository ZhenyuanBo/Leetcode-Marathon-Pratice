class MyHashSet {
    //hash chaining
    final ListNode[] nodes = new ListNode[1000001];
    
    /** Initialize your data structure here. */
//     public MyHashSet() {
        
//     }
    
    public void add(int key) {
        int i=idx(key);
        if(nodes[i]==null)
            nodes[i]=new ListNode(-1);
        ListNode prev = find(nodes[i], key);
        if(prev.next==null){
            prev.next = new ListNode(key);
        }
        else prev.next.key = key;
    }
    
    public void remove(int key) {
        int i = idx(key);
        if(nodes[i]==null) return;
        else{
            ListNode prev=find(nodes[i], key);
            if(prev.next==null) return;
            prev.next = prev.next.next;
        }
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int i=idx(key);
        if(nodes[i]==null) return false;
        ListNode prev=find(nodes[i], key);
        if(prev.next==null) return false;
        return true;
    }
    
    //generate a hashcode
    public int idx(int n){
        return Integer.hashCode(n) % nodes.length;
    }
    
    //locate a specific node
    public ListNode find(ListNode bucket, int key){
        ListNode node = bucket, prev=null;
        while(node!=null && node.key !=key ){
            prev=node;
            node = node.next;
        }
        return prev;
    }
}
class ListNode{
    int key;
    ListNode next;
    ListNode(int key){
        this.key = key;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */