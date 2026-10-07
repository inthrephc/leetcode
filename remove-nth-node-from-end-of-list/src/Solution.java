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
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int index = 0;
        var dummy = head;
        while (dummy != null) {
            index++;
            dummy = dummy.next;
        }
        dummy = head;

        if (n == index) {
            return head.next;
        }

        if (n == 1) {
            while (index - 1 != n) {
                dummy = dummy.next;
                index--;
            }
            dummy.next = null;
            return head;
        }

        while (index - 1 != n) {
            dummy = dummy.next;
            index--;
        }

        dummy.next = (dummy.next).next;

        return head;
    }

    public static void main(String[] args) {
        var list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        var n = 5;
        var res = removeNthFromEnd(list, n);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}