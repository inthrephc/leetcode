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
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var res = new ListNode(0);
        var dummy = res;
        int r = 0;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                var sum = l2.val + r;
                r = sum / 10;
                sum %= 10;
                dummy.next = new ListNode(sum);
                dummy = dummy.next;
                l2 = (l2.next == null) ? null : l2.next;
            } else if (l2 == null) {
                var sum = l1.val + r;
                r = sum / 10;
                sum %= 10;
                dummy.next = new ListNode(sum);
                dummy = dummy.next;
                l1 = (l1.next == null) ? null : l1.next;
            } else {
                var sum = l1.val + l2.val + r;
                r = sum / 10;
                sum %= 10;
                dummy.next = new ListNode(sum);
                dummy = dummy.next;
                l1 = (l1.next == null) ? null : l1.next;
                l2 = (l2.next == null) ? null : l2.next;
            }
        }

        if (r != 0) dummy.next = new ListNode(r);

        return res.next;
    }

    public static void main(String[] args) {
        var l1 = new ListNode(1, new ListNode(2, new ListNode(4, new ListNode(9, new ListNode(9, new ListNode(9))))));
        var l2 = new ListNode(8, new ListNode(4, new ListNode(7)));
        var res = addTwoNumbers(l1, l2);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}