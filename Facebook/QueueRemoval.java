import java.io.*; 
import java.util.*;
// Add any extra import statements you may need here


class Main {

  // Add any helper functions you may need here
  class Pair{
	int index;
	int val;
	
	Pair(int val, int index){
	
		this.index = index;
		this.val = val;
	}
}

  int[] findPositions(int[] arr, int x) {
    // Write your code here
    Queue<Pair> queue_1 = new LinkedList<Pair>();
		int[] ans = new int[x];
		int l = 0;
		for(int i=0;i<arr.length;i++) {
			queue_1.add(new Pair(arr[i], i));
		}
		
		while(!queue_1.isEmpty()) {
			
      	if(l == x) {
						queue_1.clear();
						break;
					}
			
			
			Queue<Pair> queue_2 = new LinkedList<Pair>();
			int max = Integer.MIN_VALUE;
			int counter = 0;
			int index = 0;
			
			while(counter != x && !queue_1.isEmpty()) {
				
				Pair pair = queue_1.poll();
				if(pair.val > max) {
					max = pair.val;
					index = pair.index;
					ans[l] = index+1;
				}
				queue_2.add(pair);
				counter++;
			}
			
			
			
		//	System.out.println("  maximum  : "+ (index+1));
			
			
			while(!queue_2.isEmpty()) {
				Pair pair = queue_2.poll();
			//	System.out.print(" = > "+ pair.val);
				if(pair.index != index) {
					
					if(pair.val - 1 >=0) {
						queue_1.add(new Pair(pair.val-1, pair.index));
					}else {
						queue_1.add(pair);
					}
					
				}
			}
		l++;
		}
		
		return ans;
  }

}
