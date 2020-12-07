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
        if(head == null) {
			 return null;
		 }
		 
	
		 
		 ListNode temp = head;
		 int c = 0;
		 while(temp != null) {
			 temp = temp.next;
			 c++;
		 }
		 
		 n = c- n + 1;
		 
		 if(n == 1) {
			 head = head.next;
			 return head;
		 }
		 
		 
		 int count =1;
		 ListNode saveptr = head;
		 ListNode prev = null;
		 while(saveptr != null) {
						
			if(count == n) {
				break;
			}
             
			prev = saveptr;
			saveptr = saveptr.next;
			count++;
		} 
		
		 if(prev != null && saveptr != null) {
			 prev.next = saveptr.next;	 
		 }
		 return head;
    }
}
