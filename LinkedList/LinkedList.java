package LinkedList;

import javax.sound.sampled.ReverbType;

// import java.util.LinkedList;

public class LinkedList {

	static Node head;
	static class Node{
		
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
		
	}
	
	public static void insertAtEnd(int data) {
		
		Node node = new Node(data);
		
		Node currHead = head;
		if(currHead == null) {
			currHead = node;
		}
		else {
			while(currHead.next != null) {
				currHead = currHead.next;
			}
		}
		
		currHead.next = node;
	}
	
	public static void insertAtBeg(int data) {
		
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}
		else {
			Node temp = head;
			head = newNode;
			head.next= temp;
		}	
	}
	
	public static void removeNthNode(int pos) {
		
		if(head!=null && pos!=0) {
			Node curr = head;
			Node prev = null;
			while(--pos > 0 && curr!=null) {
				prev= curr;
				curr = curr.next;
			}
			if(prev!=null && curr!=null) {
				
				Node temp = curr.next;
				prev.next= temp;
			}else if(prev == null && curr!=null){
				head = curr.next;
			}	
		}
		
	}
	
	public static void reverseLinkedList() {
		
		//1->2->3->4
		//4->3->2->1
		
		Node curr = head;
		Node prev = null;
		Node next=null;
		
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}
	
	public static void reverseLinkedListMtoN(int m, int n) {
		// m = 2 to 4
		// 1->2->3->4->5
		// 1->4->3->2->5
		
		Node curr = head;
		Node prev = null;
		Node next = null;
		int count =0;
		
		Node save;
		
		while(curr !=null && count+1 != m) {
			prev = curr;
			curr= curr.next;
			count ++;
		}
		
		int reverseNodesCount = n - m +1;
		 System.out.println("curent node: "+ curr.data + " Count = "+ reverseNodesCount);
	//	if(prev == null) {
		//	save = head;
	//	}else {
			save = prev;
		//}
		
		
//		System.out.println("prev = "+ prev.data);
		prev= null;
		
		while(curr!=null && reverseNodesCount > 0) {
			
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			reverseNodesCount --;
			System.out.println("Reversed the nodes!");
		}
		if(save != null) {
		Node temp = save.next;
		save.next = prev;
		temp.next = curr;
		}else {

		//	System.out.println("prev = : "+ prev.data + " curr = : "+ curr.data + " next: "+ next.data);
			Node t;
			t = head;
			head = prev;
			t.next = curr;
			//head.next = curr;
		}
		//System.out.println("current node = "+ curr.data);
		
	}
	
	public static void insertAtPos(int data, int pos) {
		
		Node curr = head;
		Node newNode = new Node(data);
		
		if(curr != null && pos != 1) {
			
			while(--pos > 0 && curr!=null) {
				curr = curr.next;
			}
			if(curr!=null) {
			Node temp = curr.next;
			curr.next = newNode;
			newNode.next = temp;
			}
		}else {
			insertAtBeg(data);
		}
	}
	
	public static void removeNthNodeFromEnd(int pos) {
		Node curr = head;
		int count =1;
		while(curr!=null) {
			count ++;
			curr = curr.next;
		}
		removeNthNode(count-pos+1);
	}
	
	void printList() {
		
		Node curr = head;
		while(curr!=null) {
			System.out.print(" "+ curr.data);
			curr = curr.next;
		}
	}
	
	
	public static void main(String[] args) {
		
		LinkedList obj = new LinkedList();
		head = new Node(1);
		
		head.next = new Node(2);
		head.next.next = new Node(3);
		
		System.out.println(" Original!");
		obj.printList();
		
		insertAtEnd(4);
		insertAtEnd(5);
		
		System.out.println(" \nAfter inserting at end!");
		obj.printList();
		
		insertAtBeg(10);
		
		System.out.println(" \nAfter inserting at beg!");
		obj.printList();
		
		insertAtPos(6, 2);
		
		System.out.println(" \nAfter inserting at index!");
		obj.printList();
		
		removeNthNode(6);
		
		System.out.println(" \nAfter Removing the node at index!");
		obj.printList();
		
		removeNthNodeFromEnd(1);
		
		System.out.println(" \nAfter Removing the Nth node from end!");
		obj.printList();
		
		reverseLinkedList();
		
		System.out.println(" \nAfter Reversing the linkedlist !");
		obj.printList();
	
		reverseLinkedListMtoN(1, 2);
		
		System.out.println(" \nAfter Reversing the linkedlist from M to N!");
		obj.printList();
	}
}
