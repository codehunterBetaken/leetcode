package E160;

public class IntersectionofTwoLinkedLists {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // 如何对齐，p+q = q+p  这题我抄的！！！
        if(headA==null||headB==null) return null;
        ListNode p = headA, q = headB;
        while(p!=q){
            p = p==null?headB:p.next;
            q = q==null?headA:q.next;
        }
        return p;
    }

    public static void main(String[] args) {
        ListNode node6 = new ListNode(6);
        ListNode node5 = new ListNode(5, node6);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(21, node3);
        ListNode headA = new ListNode(11, node2);
        ListNode headB = new ListNode(22,node3);
        getIntersectionNode(headA, headB);
    }
}
