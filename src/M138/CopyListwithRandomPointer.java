package M138;
import java.util.HashMap;

public class CopyListwithRandomPointer {
    public  static Node copyRandomList(Node head) {
        if(head == null) return head;
        Node node = head;
        HashMap<Node,Node> map = new HashMap<>();
        while(node != null){
            Node clone = new Node(node.val);
            map.put(node,clone);
            node = node.next;
        }
        node = head;
        while (node != null) {
            map.get(node).next = map.get(node.next);
            map.get(node).random = map.get(node.random);
            node = node.next;
        }
        return map.get(head);
    }


    public static void main(String[] args) {
        Node node5 = new Node(1);
        Node node4 = new Node(10,node5);
        Node node3 = new Node(11,node4);
        Node node2 = new Node(13,node3);
        Node head = new Node(7,node2);
        node2.setRandom(head);
        node3.setRandom(node5);
        node4.setRandom(node3);
        node5.setRandom(head);
        copyRandomList(head);

    }
}
