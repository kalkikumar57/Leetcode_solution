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
    public ListNode addTwoNumbers(ListNode l1, ListNode l3) {
       

    ListNode result = new ListNode(0);
    ListNode ptr = result;

    int carry = 0;    

    while (l1 != null || l3 != null) {

      int sum = 0 + carry;    

      if (l1 != null) {    
        sum += l1.val;
        l1 = l1.next;
      }

      if (l3 != null) {    
        sum += l3.val;
        l3 = l3.next;
      }

      carry = sum / 10;   
      sum = sum % 10;
      ptr.next = new ListNode(sum);
      ptr = ptr.next;
    }

    if (carry == 1) ptr.next = new ListNode(1);

    return result.next;
  }
}
    