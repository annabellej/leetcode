public class AddTwoNumbers
{
    /**
     * ListNode object: singly-linked list (from LeetCode)
     */
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    /**
     * Sums the two numbers given by two linked lists.
     *
     * @param l1 linked list providing digits in reverse order
     * @param l2 linked list providing digits in reverse order
     *
     * @return the sum of the two numbers given by the linked lists.
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode curNode = result;

        while (l1 != null || l2 != null) {
            if (l1 != null) {
                curNode.val += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                curNode.val += l2.val;
                l2 = l2.next;
            }

            if (l1 != null || l2 != null) {
                curNode.next = new ListNode(0);
            }

            if (curNode.val >= 10) {
                if (curNode.next == null) {
                    curNode.next = new ListNode(0);
                }

                curNode.next.val += 1;
                curNode.val %= 10;
            }

            curNode = curNode.next;
        }

        return result;
    }
}
