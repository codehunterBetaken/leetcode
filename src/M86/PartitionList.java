package M86;

public class PartitionList {

    public static ListNode partition(ListNode head, int x) {
        ListNode lessHead = new ListNode();
        ListNode moreHead = new ListNode();
        ListNode lessPtr = lessHead;
        ListNode morePtr = moreHead;

        while (head != null) {
            if (head.val < x) {
                lessPtr.next = head;
                lessPtr = head;
            } else {
                morePtr.next = head;
                morePtr = head;
            }
            head = head.next;
        }
        lessPtr.next = moreHead.next;
        morePtr.next = null;
        return lessHead.next;

    }

    public static void main(String[] args) {
        ListNode node6 = new ListNode(2);
        ListNode node5 = new ListNode(5, node6);
        ListNode node4 = new ListNode(2, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(4, node3);
        ListNode head = new ListNode(1, node2);
        partition(head, 3);

    }
}
