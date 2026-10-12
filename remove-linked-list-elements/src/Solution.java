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
    public static void main(String[] args) {
        var list = new ListNode(3, new ListNode(3, new ListNode(3, new ListNode(3, new ListNode(3, new ListNode(3))))));
        var val = 3;
        var res = removeElements(list, val);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }

    public static ListNode removeElements(ListNode head, int val) {
        var tmp = new ListNode(0);
        tmp.next = head;
        var idx = tmp;
        try {
            while (idx.next != null) {
                if ((idx.next).val == val) {
                    idx.next = ((idx.next).next == null) ? null : (idx.next).next;
                } else {
                    idx = idx.next;
                }
            }

            return tmp.next;
        } catch (Exception e) {
            return head;
        }
    }
}