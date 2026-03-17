
// LeetCode 19 – Remove Nth Node From End of List

package module10;
class Element {
    int data;
    Element next;
    Element(int data) {
        this.data = data;
        this.next = null;
    }
}
public class RemoveNthFromEnd {
    static Element removeNth(Element head, int n) {
        Element fast = head;
        Element slow = head;
        // move fast n times
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        // if remove first node
        if (fast == null) {
            return head.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    static void print(Element head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Element head = new Element(1);
        head.next = new Element(2);
        head.next.next = new Element(3);
        head.next.next.next = new Element(4);
        head.next.next.next.next = new Element(5);
        head = removeNth(head, 2);
        print(head);
    }
}