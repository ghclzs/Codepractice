package LinkList;

public class ReverseLinkList {
    //递归方法
    public Node reverse1(Node head){
        if(head==null||head.next==null)
            return head;
        Node temp = head.next;
        Node newHead = reverse1(head.next);
        temp.next = head;
        head.next = null;
        return newHead;


    }
    //遍历方法
    public Node reverse2(Node node){
        Node pre = null;
        Node next = null;
        while(node!=null){
            next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        ReverseLinkList reverseLinkList = new ReverseLinkList();
        Node newnode = reverseLinkList.reverse2(node);
        System.out.println(newnode.value);
        System.out.println(newnode.next.value);
        System.out.println(newnode.next.next.value);


    }



}
