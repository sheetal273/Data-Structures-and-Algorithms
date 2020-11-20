/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
		public static void main(String[] args) {
		
	//	int[] n = {1,2,3};
		Scanner scanner = new Scanner(System.in);
		int T = Integer.valueOf(scanner.nextLine().trim());
		
		while(T > 0) {
			
			T--;
			String str = scanner.next();
			char arr[] = str.toCharArray();
			HashSet set = new HashSet();

			generateCombinations(arr, 0, set);
			
			Set<String> treeSet = new TreeSet<String>(set);
			Iterator it = treeSet.iterator();
			
			while(it.hasNext()) {
				System.out.print(it.next() + " ");
			}
				System.out.println("");
		}
		
	}

	private static void generateCombinations(char[] n, int cid, HashSet set) {
		// TODO Auto-generated method stub
		
		if(cid == n.length-1) {
			String str="";
			for(int i =0;i< n.length;i++) {
			//	System.out.print(n[i]);
				 str = str + n[i];
			}
			set.add(str);
			// System.out.print(" ");
		}
		
		for(int i=cid;i <n.length ;i++) {
			
			if(n[i] != n[cid] || cid == i) {
				swap(n, i, cid);
				generateCombinations(n, cid+1, set);
				swap(n, i, cid);
			}
		}
		
	}

	private static void swap(char[] arr, int start, int end) {
		// TODO Auto-generated method stub
		
		char temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	
		
	
	}
	
	
}
