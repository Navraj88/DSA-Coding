public class MergeTwoSortedList {
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
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode newlist = new ListNode(0);
            ListNode trav = newlist;
            while (list1 != null && list2 != null) {
                ListNode temp;
                if (list1.val <= list2.val) {
                    temp = list1;
                    list1 = list1.next;
                    trav.next = temp;
                } else {
                    temp = list2;
                    list2 = list2.next;
                    trav.next = temp;
                }
                trav = trav.next;
            }
            while (list1 != null) {
                ListNode temp;
                temp = list1;
                list1 = list1.next;
                trav.next = temp;
                trav = trav.next;

            }
            while (list2 != null) {
                ListNode temp;
                temp = list2;
                list2 = list2.next;
                trav.next = temp;
                trav = trav.next;

            }
            return newlist.next;
        }
    }
}
