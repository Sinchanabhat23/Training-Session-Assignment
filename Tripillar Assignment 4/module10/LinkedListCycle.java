
// LeetCode 141 – Linked List Cycle

package module10;
class Link {
    int data;
    Link next;
    Link(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkedListCycle {
    static boolean hasCycle(Link head) {
        Link slow = head;
        Link fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;        // move 1 step
            fast = fast.next.next;   // move 2 steps
            if (slow == fast) {
                return true;   // cycle found
            }
        }
        return false;   // no cycle
    }
    public static void main(String[] args) {
        Link head = new Link(1);
        head.next = new Link(2);
        head.next.next = new Link(3);
        head.next.next.next = new Link(4);
        // create cycle
        head.next.next.next.next = head.next;
        System.out.println(hasCycle(head));
    }
}