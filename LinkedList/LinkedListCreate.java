package LinkedList;

import java.util.LinkedList;

public class LinkedListCreate {

	public static void main(String args[]) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		for (Integer integer : list) {
			System.out.print(" " + integer);
		}
		
		list.addFirst(0);
		System.out.println("\nAfter addition 0 on first");
		for (Integer integer : list) {
			System.out.print(" " + integer);
		}
		
	}
}
