public class RemoveNthNodeFromEnd {
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode forward = head;
        for (int i = 1; i < n; i++) {
            forward = forward.next;
        }

        ListNode front = head;
        ListNode temp= new ListNode();
        while (forward!=null && forward.next != null) {
            temp=front;
            forward = forward.next;
            front=front.next;
        }
        if(front==head){
            head=head.next;
        }
        else{
            temp.next=front.next;
        }
        return head;
    }
}
