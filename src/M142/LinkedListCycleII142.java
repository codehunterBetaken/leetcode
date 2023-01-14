package M142;

public class LinkedListCycleII142 {

    public static ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode meet = null;
        while (null != fast.next) {
            fast = fast.next;
            slow = slow.next;
            if (null == fast.next) {
                break;
            }
            fast = fast.next;
            if (fast == slow) {
                meet = slow;
                break;
            }
        }

        if (meet == null) {
            return null;
        }

        while (null != head && null != meet) {
            if (head == meet) {
                return meet;
            }
            head = head.next;
            meet = meet.next;
        }
        return null;
    }


    public static void main(String[] args) {
        ListNode node6 = new ListNode(6);
        ListNode node5 = new ListNode(5, node6);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node2);
        node6.setNextNode(node4);
        ListNode in = detectCycle(head);
        System.out.println(in.val);
    }
}
