class Node{
    int key; int val; Node next; Node prev;
    Node(int key, int val){
        this.key=key;
        this.val=val;
        next = prev = null;
    }
}
class LRUCache {
    int capacity; HashMap<Integer,Node> map; Node left; Node right;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        left = new Node(0,0);
        right = new Node(0,0);
        left.next = right;
        right.prev = left;
    }
    public void remove(Node node){
        Node prev=node.prev, nxt = node.next;
        prev.next = nxt;
        nxt.prev=prev;
        
    }
    public void insert(Node node){
        Node prev=right.prev, nxt=right;
        prev.next=nxt.prev=node;
        node.next=nxt;
        node.prev=prev;
    }
    public int get(int key) {
        if(map.containsKey(key)){
            remove(map.get(key));
            insert(map.get(key));
            return map.get(key).val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        map.put(key, new Node(key, value));
        insert(map.get(key));
        if(map.size() > capacity){
            Node lru = left.next;
            remove(lru);
            map.remove(lru.key);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */