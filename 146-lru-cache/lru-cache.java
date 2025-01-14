class Node {
    int k = 0;
    int val = 0;
    Node next = null;
    Node prev = null;

    Node() {}

    Node(int key, int value) {
        this.k = key;
        this.val = value;
    }
}

class LRUCache {
    HashMap<Integer, Node> hm;
    Node h, t;
    int cap;

    public LRUCache(int capacity) {
        hm = new HashMap<>();
        h = new Node();
        t = new Node();
        h.next = t;
        t.prev = h;
        cap = capacity;
    }

    private void delete(Node d) {
        Node d1 = d.prev;
        Node d2 = d.next;
        d1.next = d2;
        d2.prev = d1;
        d.next = null;
        d.prev = null;
    }

    private void add(Node n) {
        Node n1 = t.prev;
        n1.next = n;
        n.prev = n1;
        n.next = t;
        t.prev = n;
    }

    public int get(int key) {
        if (!hm.containsKey(key)) return -1;

        Node temp = hm.get(key);
        delete(temp);
        add(temp);
        return temp.val;
    }

    public void put(int key, int value) {
        if (hm.containsKey(key)) {
            Node node = hm.get(key);
            delete(node);
            node.val = value;
            add(node);
        } else {
            if (hm.size() == cap) {
                // Remove the LRU node
                Node lru = h.next;
                delete(lru);
                hm.remove(lru.k);
            }
            Node newNode = new Node(key, value);
            add(newNode);
            hm.put(key, newNode);
        }
    }
}
