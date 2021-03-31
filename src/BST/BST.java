package BST;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

public class BST <E extends Comparable<E>>{

    private class Node{
        public E e;
        public Node left;
        public Node right;
        public Node(E e){
            this.e = e;
            this.left = null;
            this.right = null;
        }

    }
    private Node root;
    private int size;

    public BST(){
        root = null;
        size = 0;
    }

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void add(E e){
        root = add(root,e);
    }
    public Node add(Node node,E e){
        if(node==null){
            size++;
            return new Node(e);
        }
        if(e.compareTo(node.e)<0){
            node.left = add(node.left,e);
        }else if (e.compareTo(node.e)>0){
            node.right = add(node.right,e);
        }
        return node;
    }
    public boolean contains(E e){
        return contains(root,e);
    }
    private boolean contains(Node node,E e){
        if(node==null){
            return false;
        }
        if(e.compareTo(node.e)==0){
            return true;
        }else if(e.compareTo(node.e)<0) {
            return contains(node.left,e);
        }else {
            return contains(node.right,e);
        }
    }

    //前序递归遍历
    private void preOrder(Node node){
        if (node==null){
            return;
        }
        System.out.println(node.e);
        preOrder(node.left);
        preOrder(node.right);
    }

    //前序非递归遍历
    private void preOrderNR(Node node){
        if(size==0){
            throw new IllegalArgumentException("BST is empty！");
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            Node cur = stack.pop();
            System.out.println(cur.e);
            if(cur.right!=null){
                stack.push(cur.right);
            }
            if(cur.left!=null){
                stack.push(cur.left);
            }
        }
    }

    //递归中序遍历
    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(root.left);
        System.out.println(node.e);
        inOrder(root.right);
    }
    //后续遍历
    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.e);

    }

    //层序遍历
    public void levelOrder() {
        if (size == 0) {
            throw new IllegalArgumentException("BST is empty！");
        }
    }
    //查找二分搜索树中的最小值
    public E minimum(){
        return minimum(root).e;
    }
    private Node minimum(Node node){
        if(size==0){
            throw new IllegalArgumentException("BST is empty！");
        }
        if(node.left==null){
            return node;
        }else {
            return minimum(node.left);
        }
    }

    //查找二分搜索树中的最大值
    public E maximum(){
        return maximum(root).e;
    }
    private Node maximum(Node node){
        if(size==0){
            throw new IllegalArgumentException("BST is empty！");
        }
        if(node.right==null){
            return node;
        }else {
            return maximum(node.right);
        }
    }
    //删除二分树中的最小节点
    public E removeMin(){
        Node res = minimum(root);
        root = removeMin(root);
        return res.e;
    }
    private  Node removeMin(Node node){
        if(node.left==null){
            Node rightNode = node.right;
            node.right = null;
            size--;
            return rightNode;
        }
        node.left = removeMin(node.left);
        return node;

    }

    //删除二分树中的最大节点
    public E removeMax(){
        Node res = maximum(root);
        root = removeMax(root);
        return res.e;
    }
    private Node removeMax(Node node){
        if(node.right==null){
            Node leftNode = node.left;
            node.left = null;
            size--;
            return leftNode;

        }
        node.right = removeMax(node.right);
        return node;
    }

    //删除二分搜索树的任意节点
    public void remove(E e){
        root = remove(root,e);
    }
    private Node remove(Node node,E e){
        if(node==null){
            return null;
        }
        if(e.compareTo(node.e)<0){
            node.left = remove(node.left,e);
        }else if(e.compareTo(node.e)>0){
            node.right = remove(node.right,e);

        }else{
            if(node.left==null){
                Node rightNode = node.right;
                node.right = null;
                size--;
                return rightNode;
            }
            if(node.right==null){
                Node leftNode = node.left;
                node.left = null;
                size--;
                return leftNode;
            }
            Node successor = minimum(node.right);
            successor.right = removeMin(node.right);
            successor.left = node.left;
            return successor;
        }
        return node;
    }








}
