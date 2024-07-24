/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
       Set <ListNode> store = new HashSet<>();
        while(head != null){
          if(store.contains(head)){
              return true;
          }  else{
              store.add(head);
          }
            head= head.next;
        }
        return false;
        
    }
}