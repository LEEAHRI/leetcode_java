/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) { // array int[]
        ListNode slow = head; //head를 바라봐라.
    }

    public static void main(String[] argv) {
        Solution s = new Solution();
        // ListNode list = ...;
        // s.reorderList(list);
        s.swap(a, b);

        System.out.println("a = " + a + ", b = " + b); // a = 5, b = 3
    }

    public void swap(Integer a, Integer b) { // call by value
        Integer tmp = a;
        a = b;
        b = tmp;
    }

}
