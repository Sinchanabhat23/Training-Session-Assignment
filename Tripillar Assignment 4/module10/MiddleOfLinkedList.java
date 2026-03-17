
// LeetCode 876 – Middle of the Linked List

package module10;
class ListNode {
    int data;
    ListNode next;
    public ListNode(int data) {
        this.data = data;
    }
}
public class MiddleOfLinkedList {
    static int findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(9);
        System.out.println("Middle of LinkedList is: " + findMiddle(head1));
        // Example 2
        ListNode head2 = new ListNode(8);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(7);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(5);
        head2.next.next.next.next.next = new ListNode(1);
        System.out.println("Middle of LinkedList is: " + findMiddle(head2));
    }
}