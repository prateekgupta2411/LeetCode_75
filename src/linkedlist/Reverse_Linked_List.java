package linkedlist;

class ListNode2 {
    int val;
    ListNode2 next;

    ListNode2() {
    }

    ListNode2(int val) {
        this.val = val;
    }

    ListNode2(int val, ListNode2 next) {
        this.val = val;
        this.next = next;
    }
}

public class Reverse_Linked_List {

    // Iterative approach: Reversing the linked list using a loop and three pointers (prev, curr, next)
    public static ListNode2 reverseList(ListNode2 head) {
        ListNode2 prev = null;
        ListNode2 curr = head;
        while (curr != null) {
            ListNode2 next = curr.next;
            curr.next = prev;  // Reversing the pointer
            prev = curr;       // Moving prev forward
            curr = next;       // Moving curr forward
        }
        return prev; // New head of the reversed list
    }

    // Recursive approach: Reversing the linked list recursively
    public static ListNode2 reverseList1(ListNode2 head) {
        if (head == null || head.next == null) {
            return head; // Base case: return when reaching the last node or null
        }
        ListNode2 newHead = reverseList1(head.next);  // Recursive call to reverse the rest of the list
        head.next.next = head; // Reverse the link for the current node
        head.next = null;      // Set the current node's next pointer to null
        return newHead;        // Return the new head after reversal
    }

    // Create new linked list using extra space: Reversing by creating a new linked list
    public static ListNode2 reverseListExtraSpace(ListNode2 head) {
        ListNode2 newLL = null; // New reversed linked list head
        ListNode2 curr = head;

        while (curr != null) {
            // Create a new node with the same value as the current node
            ListNode2 newNode = new ListNode2(curr.val);

            // Insert this new node at the beginning of the new linked list
            newNode.next = newLL;
            newLL = newNode;

            // Move to the next node in the original list
            curr = curr.next;
        }

        return newLL; // New head of the reversed linked list
    }

    // Swap values in the two halves of the linked list: Reverse second half and swap the values of corresponding nodes
    public static void reverseListSwap(ListNode2 head) {
        if (head == null || head.next == null) return; // Edge case: Empty or single-node list

        // Step 1: Find the middle using slow and fast pointers
        ListNode2 slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the list
        ListNode2 prev = null, curr = slow;
        while (curr != null) {
            ListNode2 next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: Reattach the second half to the first half
        ListNode2 left = head, right = prev;
        while (right != null) {
            // Swap values
            int temp = left.val;
            left.val = right.val;
            right.val = temp;

            // Move inward
            left = left.next;
            right = right.next;
        }

        // Ensure the first half and the reversed second half are connected properly.
        if (left != null) {
            left.next = null; // To avoid linking to a node that doesn't exist
        }
    }


    // Utility function to print the linked list
    public static void printList(ListNode2 head) {
        ListNode2 temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Test the four reversal techniques
    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode2 head = new ListNode2(1);
        head.next = new ListNode2(2);
        head.next.next = new ListNode2(3);
        head.next.next.next = new ListNode2(4);
        head.next.next.next.next = new ListNode2(5);

        System.out.println("Original List:");
        printList(head);

        // Test the Iterative Approach
        System.out.println("\nAfter Reverse (Iterative):");
        ListNode2 reversedIterative = reverseList(head);
        printList(reversedIterative);
//
//        // Recreate the original list
//        head = new ListNode2(1);
//        head.next = new ListNode2(2);
//        head.next.next = new ListNode2(3);
//        head.next.next.next = new ListNode2(4);
//        head.next.next.next.next = new ListNode2(5);
//
//        // Test the Recursive Approach
//        System.out.println("\nAfter Reverse (Recursive):");
//        ListNode2 reversedRecursive = reverseList1(head);
//        printList(reversedRecursive);
//
//        // Recreate the original list
//        head = new ListNode2(1);
//        head.next = new ListNode2(2);
//        head.next.next = new ListNode2(3);
//        head.next.next.next = new ListNode2(4);
//        head.next.next.next.next = new ListNode2(5);
//
//        // Test the Extra Space Approach
//        System.out.println("\nAfter Reverse (Extra Space):");
//        ListNode2 reversedExtraSpace = reverseListExtraSpace(head);
//        printList(reversedExtraSpace);
//
//        // Recreate the original list
//        head = new ListNode2(1);
//        head.next = new ListNode2(2);
//        head.next.next = new ListNode2(3);
//        head.next.next.next = new ListNode2(4);
//        head.next.next.next.next = new ListNode2(5);
//
//        // Test the Swap Values Approach
//        System.out.println("\nAfter Reverse (Swap Values):");
//        reverseListSwap(head);
//        printList(head);
    }
}
