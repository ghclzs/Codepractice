package Map;

public class LinkedListMap<K,V> implements Map<K,V>{
    private class Node{
        public K key;
        public V value;
        public Node next;
        public Node(){
            this(null,null,null);
        }
        public Node(K key,V value){
            this(key,value,null);
        }
        public Node(K key,V value,Node next){
            this.key = key;
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    ", value=" + value +
                    ", next=" + next +
                    '}';
        }
    }
    private Node dummyHead; //虚拟头结点
    private int size;
    //初始化参数
    public LinkedListMap(){
        dummyHead = new Node();
        size = 0;
    }
    private Node getNode(K key){
        Node cur = dummyHead.next;
        while (cur!=null){
            if(cur.key.equals(key)){
                return cur;
            }else {
                cur = cur.next;
            }
        }
        return null;
    }
    //判断数据是否存在改map内
    @Override
    public boolean contains(K key) {
        return getNode(key)!=null;
    }

    @Override
    public V get(K key) {
        Node node = getNode(key);
        return node==null?null:node.value;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public void add(K key, V value) {
        Node node = getNode(key);
        if(node==null){
            dummyHead.next = new Node(key,value,dummyHead.next);
            size++;
        }else {
            node.value = value;
        }
    }

    @Override
    public void set(K key, V newValue) {
        Node node = getNode(key);
        if(node==null){
            throw new IllegalArgumentException(key + " dosen't exist!");
        }
        node.value = newValue;
    }

    @Override
    public V remove(K key) {
        Node prev = dummyHead;
        while (prev.next!=null){
            if(prev.next.key.equals(key)){
                break;
            }else {
                prev = prev.next;
            }
        }
        if(prev.next!=null){
            Node delNode = prev.next;
            prev.next = delNode.next;
            delNode.next = null;
            size--;
            return delNode.value;
        }
        return null;
    }
}
