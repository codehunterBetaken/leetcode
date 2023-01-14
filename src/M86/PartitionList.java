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
        ListNode ListNode6 = new ListNode(2);
        ListNode ListNode5 = new ListNode(5, ListNode6);
        ListNode ListNode4 = new ListNode(2, ListNode5);
        ListNode ListNode3 = new ListNode(3, ListNode4);
        ListNode ListNode2 = new ListNode(4, ListNode3);
        ListNode head = new ListNode(1, ListNode2);
        partition(head, 3);

    }
}
