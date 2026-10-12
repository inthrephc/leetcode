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
    public static ListNode deleteDuplicates(ListNode head) {
        var index = head;

        while (index != null && index.next != null) {

            while (index.next != null && index.val == (index.next).val) {
                index.next = ((index.next).next != null) ? (index.next).next : null;
            }

            index = index.next;
        }

        return head;
    }

    public static void main(String[] args) {
        var list = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        var res = Solution.deleteDuplicates(list);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}