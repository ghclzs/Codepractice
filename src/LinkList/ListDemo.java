package LinkList;

public class ListDemo {

    private class ListNode2{
        int value;
        Node next;
        public ListNode2(int val){
            this.value = val;
        }

    }

    public Node reverListNode(Node node){
        Node pre = null;
        Node next = null;
        while (node!=null){
            next = node.next;
            node.next = pre;
            pre = node;
            node = next;

        }
        return pre;

    }
}
