class TopologicalSort {
    static int[] topoSort(ArrayList<ArrayList<Integer>> list, int V) {
        // add your code here
        
        boolean[] visited = new boolean[V];
		Stack<Integer> stack = new Stack<Integer>();
		
		
		for(int i=0;i< V;i++) {

	if(!visited[i]) {
	
		topologicalSortRec(list, list.get(i), stack, visited, i);
		
		
	}
		}
		
        int[] out = new int[stack.size()];
		int k =0;
		while(!stack.isEmpty()) {
		
			out[k++] = stack.pop();
		}
		
		Collections.reverse(Arrays.asList(out));
		return out;
		
    }
    
    	static void topologicalSortRec(ArrayList<ArrayList<Integer>> list2, ArrayList<Integer> arrayList, Stack<Integer> stack, boolean[] visited, int i2) {
		// TODO Auto-generated method stub
	
		for(int i=0;i< arrayList.size();i++) {
			

			if(!visited[arrayList.get(i)]) {
		
			
				topologicalSortRec(list2, list2.get(arrayList.get(i)), stack, visited, arrayList.get(i));

			}
			
		}
        stack.push(i2);

		visited[i2] = true;
		
	}

}
