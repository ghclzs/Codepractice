package Map;

public class BSTMap<K extends Comparable<K>,V> implements Map<K,V>{

    private class Node{
        public K key;
        public V value;
        public Node left;
        public Node right;
        public Node(K key,V value){
            this.key = key;
            this.value = value;
            this.left = null;
            this.right = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    ", value=" + value +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    private Node root;
    private int size;
    public BSTMap(){
        root = null;
        size = 0;
    }





    @Override
    public void add(K key, V value) {
        root = add(root,key,value);
    }
    private Node add(Node node,K key,V value){
        if (node==null){
            size++;
            return new Node(key,value);
        }
        if(key.compareTo(node.key)<0){
            node.left = add(node.left,key,value);
        }else if(key.compareTo(node.key)>0){
            node.right = add(node.right,key,value);
        }else {
            node.value = value;
        }
        return node;
    }

    private Node getNode(Node node,K key){
        if (node==null){
            return null;
        }
        if(key.equals(node.key)){
            return node;
        }else if(key.compareTo(node.key)<0){
            return getNode(node.left,key);
        }else {
            return getNode(node.right,key);
        }
    }




    @Override
    public V remove(K key) {
        Node node = getNode(root,key);
        if(node!=null){
            root = remove(root,key);
            return root.value;
        }
        return null;
    }
    private Node remove(Node node,K key) {
        if (node == null) {
            return null;
        }
        if (key.compareTo(node.key) < 0) {
            node.left = remove(node.left, key);
        } else if (key.compareTo(node.key) > 0) {
            node.right = remove(node.right, key);
        } else {
            if (node.left == null) {
                Node rightNode = node.right;
                node.right = null;
                size--;
                return rightNode;
            }
            if (node.right == null) {
                Node leftNode = node.left;
                node.left = null;
                size--;
                return leftNode;
            }
            Node successor = minimum(node.right);
            successor.right = removeMin(node.right);
            successor.left = node.left;
            node.left = node.right = null;
            return node;
        }
        return node;
    }
    //ceshi

    @Override
    public boolean contains(K key) {
        return getNode(root,key)!=null;
    }

    @Override
    public V get(K key) {
        Node node = getNode(root,key);
        return node==null?null:node.value;
    }

    @Override
    public void set(K key, V newValue) {
        Node node = getNode(root,key);
        if(node==null){
            throw new IllegalArgumentException(key + " dosen't exits!");
        }
        node.value = newValue;
    }

    private Node minimum(Node node){
        if(node.left==null){
            return node;
        }
        return minimum(node.left);
    }
    private Node removeMin(Node node){
        if(node.left==null){
            Node rightNode = node.right;
            node.right = null;
            size--;
            return rightNode;
        }
        node.left  = removeMin(node.left);
        return node;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }
}
