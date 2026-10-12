class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Solution {
    public static ListNode middleNode(ListNode head) {
        var slow = head;
        var fast = head;
        try {
            while (fast.next != null) {
                slow = slow.next;
                fast = (fast.next).next;
            }
        } catch (Exception e) {
            return slow;
        }

        return slow;
    }

    public static void main(String[] args) {
//        var list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        var list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        var res = middleNode(list);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}