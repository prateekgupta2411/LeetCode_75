package linkedlist;

class ListNode1 {
    int val;
    ListNode1 next;
    ListNode1() {}
    ListNode1(int val) { this.val = val; }
    ListNode1(int val, ListNode1 next) { this.val = val; this.next = next; }
}

class Odd_Even_LL {
    public static ListNode1 oddEvenList(ListNode1 head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode1 odd = head;
        ListNode1 even = head.next;
        ListNode1 evenHead = even; // Even list ko store kr liya

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead; // Odd ke last me even ko jod doo
        return head;
    }

    public static void printList(ListNode1 head) {
        ListNode1 temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode1 head = new ListNode1(1);
        head.next = new ListNode1(2);
        head.next.next = new ListNode1(3);
        head.next.next.next = new ListNode1(4);
        head.next.next.next.next = new ListNode1(5);

        System.out.println("Original List:");
        printList(head);
        System.out.println("After Odd-Even Transformation:");
        printList(oddEvenList(head));
    }
}
