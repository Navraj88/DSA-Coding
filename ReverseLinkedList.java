
public class ReverseLinkedList {
    public class ListNode {
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

    class Solution {
        public ListNode reverseList(ListNode head) {

            ListNode curr = head;
            ListNode prev = head;
            ListNode fwd = head;

            while (fwd != null) {
                if (curr == head) {
                    fwd = curr.next;
                    curr.next = null;
                } else {
                    fwd = curr.next;
                    curr.next = prev;
                }
                prev = curr;
                curr = fwd;
            }
            return prev;
        }
    }
}
