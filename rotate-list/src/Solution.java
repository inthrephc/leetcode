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
    public static ListNode rotateRight(ListNode head, int k) {
        try {
            var dummy = head;
            var n = 0;
            while (dummy != null) {
                n++;
                dummy = dummy.next;
            }
            n = k %= n;

            if (head.next == null || k == 0) return head;
            var tmp = new ListNode(0);
            while (n-- > 0) {
                dummy = head;
                while (dummy.next != null && (dummy.next).next != null) {
                    dummy = dummy.next;
                }
                tmp = dummy.next;
                tmp.next = head;
                head = tmp;
                dummy.next = null;
            }
            return tmp;
        } catch (Exception e) {
            return head;
        }
    }

    public static void main(String[] args) {
        var list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        var list2 = new ListNode(1, new ListNode(2));
        var k = 2;
        var res = rotateRight(list2, k);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}