package linkedlist;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

class ListNode3 {
    int val;
    ListNode3 next;

    ListNode3() {
    }

    ListNode3(int val) {
        this.val = val;
    }

    ListNode3(int val, ListNode3 next) {
        this.val = val;
        this.next = next;
    }
}

public class Max_Twin_Sum_LL {
    public static int pairSum(ListNode3 head) {
        if (head == null || head.next == null) {
            return 0;  // Handle case where the list is empty or has only one element
        }

        ArrayList<Integer> list = new ArrayList<>();
        ListNode3 curr = head;

        // Add the values from the linked list into the ArrayList
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }

        int i = 0, j = list.size() - 1;
        int ans = 0;

        // Find the maximum twin sum
        while (i < j) {
            ans = Math.max(ans, list.get(i) + list.get(j));
            i++;
            j--;
        }

        return ans;  // Return the maximum twin sum
    }
    public static int pairSum1(ListNode3 head) {

        Deque<Integer> st = new ArrayDeque<>();
        int countNode = 0;

        ListNode3 cur = head;
        while(cur != null) {
            countNode++;
            cur = cur.next;
        }
        int index = 0;

        cur = head;
        while (index < countNode / 2) {
            st.push(cur.val);
            index++;
            cur = cur.next;
        }

        int res = 0;
        while (cur != null) {
            int t = st.pop();
            res = Math.max(res, t + cur.val);
            cur = cur.next;
        }
        return res;
    }
    public int pairSum2(ListNode3 head) {
        ListNode3 slow=head;
        ListNode3 fast=head;
        ListNode3 pre=null;
        ListNode3 curr=head;
        int ans=0;
        //instead of going to mid and reversing second half
        //we simply can reverse first half till mid which reduce time
        while(fast!=null){
            fast=fast.next.next;
            curr=slow;
            slow=slow.next;
            curr.next=pre;
            pre=curr;
        }
        while(slow!=null){
            ans=Math.max(ans,pre.val+slow.val);
            slow=slow.next;
            pre=pre.next;
        }
        return ans;
    }

    public static void main(String[] args) {
        // Example usage
        ListNode3 node1 = new ListNode3(5);
        ListNode3 node2 = new ListNode3(4);
        ListNode3 node3 = new ListNode3(2);
        ListNode3 node4 = new ListNode3(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println(pairSum(node1));
    }
}
