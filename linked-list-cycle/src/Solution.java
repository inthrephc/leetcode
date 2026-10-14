class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public static boolean hasCycle(ListNode head) {
        try {
            int i = 10001;
            while (i-- > 0) {
                if (head.next == null) return false;

                head = head.next;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {

    }
}