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
    public static int getDecimalValue(ListNode head) {
        int power = 1;
        var tmp = head;
        while (tmp != null) {
            power *= 2;
            tmp = tmp.next;
        }
        power /= 2;
        int res = 0;
        while (head != null) {
            res += head.val * power;
            power /= 2;
            head = head.next;
        }
        return res;
    }

    public static void main(String[] args) {
        var head = new ListNode(1, new ListNode(0, new ListNode(1)));
        System.out.println(getDecimalValue(head));
    }
}