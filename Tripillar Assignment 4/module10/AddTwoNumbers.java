
// LeetCode 2 – Add Two Numbers

package module10;
class Item {
    int data;
    Item next;
    Item(int data) {
        this.data = data;
        this.next = null;
    }
}
public class AddTwoNumbers {
    static Item add(Item a, Item b) {
        Item dummy = new Item(0);
        Item temp = dummy;
        int carry = 0;
        while (a != null || b != null || carry != 0) {
            int sum = carry;
            if (a != null) {
                sum += a.data;
                a = a.next;
            }
            if (b != null) {
                sum += b.data;
                b = b.next;
            }
            carry = sum / 10;
            temp.next = new Item(sum % 10);
            temp = temp.next;
        }
        return dummy.next;
    }
    static void print(Item head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Item a = new Item(2);
        a.next = new Item(4);
        a.next.next = new Item(3);

        Item b = new Item(5);
        b.next = new Item(6);
        b.next.next = new Item(4);

        Item result = add(a, b);

        print(result);
    }
}