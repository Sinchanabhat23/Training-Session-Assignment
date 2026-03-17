
// LeetCode 206 – Reverse Linked List

package module10;
import java.util.Scanner;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}
public class ReverseLinkedList {
    static Node head;
    // insert at end
    static void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    // reverse linked list
    static void reverse() {
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    // display list
    static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes:");
        int n = sc.nextInt();
        System.out.println("Enter the " + n + " nodes of the list:");
        for (int i = 0; i < n; i++) {
            insert(sc.nextInt());
        }
        System.out.println("Original list:");
        display();
        reverse();
        System.out.println("Reversed list:");
        display();
    }
}