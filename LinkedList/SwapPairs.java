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
    public ListNode swapPairs(ListNode head) {
        
        ListNode ptr = head;
		if(ptr == null) {
			return null;
		}
		
		while(ptr != null && ptr.next!=null) {
			
			int k = ptr.val;
			ptr.val = ptr.next.val;
			ptr.next.val = k;
			ptr = ptr.next.next;
		
		}
		
		return head;
    }
}
