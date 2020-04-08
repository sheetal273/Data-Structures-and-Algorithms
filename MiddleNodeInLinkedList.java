
public class MiddleNodeInLinkedList {

	
	 public ListNode middleNode(ListNode head) {
	        
		 if(head == null) {
			 return null;
		 }
		 
		 ListNode ptr = head;
		 int count = 0;
		 while(ptr != null) {
			 ptr = ptr.next;
			 count++;
		 }
		 int i=0;
		 System.out.println("Nodes: "+ count);
		 while(i<count/2 && head!=null) {
			 head = head.next;
			 i++;
			 
		 }
		 
		 return head;
	 }
	 
	 public static void main(String[] args) {
		 
		 ListNode node1 = new ListNode(1);
		 ListNode node2 = new ListNode(2);
		 
		 ListNode node3 = new ListNode(3);
		 ListNode node4 = new ListNode(4);
		 ListNode node5 = new ListNode(5);
		 
		 
		 node1.next= node2;
		 node2.next = node3;
		 node3.next = node4;
		/// node4.next = node5;
		 
		 MiddleNodeInLinkedList obj = new MiddleNodeInLinkedList();
		 ListNode node = obj.middleNode(node1);
		 System.out.println("data: "+ node.val);
		 
	 }
	 
	 
}

class ListNode{
	
	ListNode next;
	int val;
	
	ListNode(int x){
		this.val = x;
	}
}
