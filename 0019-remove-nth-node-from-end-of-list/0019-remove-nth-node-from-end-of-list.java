/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fastPtr=head;
        ListNode slowPtr=head;

        for(int i=0;i<n;i++){
            fastPtr=fastPtr.next;
        }
        if(fastPtr == null){
            return head.next;
        }
        while(fastPtr.next != null){
            fastPtr = fastPtr.next;
            slowPtr = slowPtr.next;
        }
        ListNode delNode = slowPtr.next;
        slowPtr.next = slowPtr.next.next;
        delNode=null;
        return head;
    }
}