package M92;

public class ReverseLinkedListII92 {
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        // 需要调整的长度
        int change_len = right - left + 1;
        ListNode pre_head = null;
        ListNode result = head;
        // 记录要倒序节点的前一个节点
        while (--left > 0) {
            pre_head = head;
            head = head.next;
        }
        // 记录倒序后尾部节点
        ListNode modify_list_tail = head;
        ListNode new_head = null;
        while (null != head && change_len-- > 0) {
            // 暂存下一个节点
            ListNode next = head.next;
            // 当前节点连接上逆序完的节点
            head.next = new_head;
            //  成为最新的逆序完节点
            new_head = head;
            // 暂存的下一个节点作为要处理的最新节点
            head = next;

        }
        // 尾部节点接上后面不需要倒序的节点
        modify_list_tail.next = head;
        if (null != pre_head) {
            pre_head.next = new_head;
        } else {
            result = new_head;
        }
        return result;

    }

    public static void main(String[ ] args) {
        ListNode node6 = new ListNode(6);
        ListNode node5 = new ListNode(5,node6);
        ListNode node4 = new ListNode(4,node5);
        ListNode node3 = new ListNode(3,node4);
        ListNode node2 = new ListNode(2,node3);
        ListNode head = new ListNode(1,node2);
        reverseBetween(head,2,3);
    }
}
