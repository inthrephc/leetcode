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
    public static ListNode reverseList(ListNode head) {
        try {
            var reversedList = new ListNode(head.val);

            while (head.next != null) {
                ListNode node = new ListNode((head.next).val);
                node.next = reversedList;
                reversedList = node;
                head = head.next;
            }

            return reversedList;

        } catch (Exception e) {
            return head;
        }
    }

    public static void main(String[] args) {
        var list = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        var res = reverseList(list);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}