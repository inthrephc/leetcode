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
    public static ListNode swapPairs(ListNode head) {
        var tmp = new ListNode(0, head);
        var dummy = tmp;
        while (dummy.next != null && (dummy.next).next != null) {
            var holder = (dummy.next).next;
            (dummy.next).next = ((dummy.next).next).next;
            holder.next = dummy.next;
            dummy.next = holder;
            dummy = (dummy.next).next;
        }
        return tmp.next;
    }

    public static void main(String[] args) {
        var list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        var res = swapPairs(list);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}