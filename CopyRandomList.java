import java.util.HashMap;
import java.util.Map;


public class CopyRandomList {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        Map<Node, Node> newVal = new HashMap<>();
        Node trav = head;
        while (trav != null) {
            newVal.put(trav, new Node(trav.val));
            trav = trav.next;
        }
        trav = head;
        while (trav != null) {
            newVal.get(trav).next = newVal.get(trav.next);
            newVal.get(trav).random = newVal.get(trav.random);

            trav = trav.next;
        }
        return newVal.get(head);
    }
}
