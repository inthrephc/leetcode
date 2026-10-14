class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

    ListNode(int x, ListNode n) {
        val = x;
        next = n;
    }
}

public class Solution {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        var tmpHeadA = headA;
        while (tmpHeadA != null) {
            var tmpHeadB = headB;
            while (tmpHeadB != null) {
                if (tmpHeadA == tmpHeadB) {
                    return tmpHeadA;
                }
                tmpHeadB = tmpHeadB.next;
            }
            tmpHeadA = tmpHeadA.next;
        }
        return null;
    }

    public static void main(String[] args) {
        var headA = new ListNode(3, new ListNode(4, new ListNode(1, new ListNode(2, new ListNode(3)))));
        var headB = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3))));
        var res = getIntersectionNode(headA, headB);
        System.out.println(res);
    }
}