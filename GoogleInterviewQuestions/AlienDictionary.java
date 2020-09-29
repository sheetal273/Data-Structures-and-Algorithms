class Solution
{
      public static void main(String args[]) {
		
		  String[] words = {"baa", "abcd", "abca", "cab", "cad"};
		
		  findOrder(words, 5, 4);
    }
    
    public String findOrder(String [] words, int N, int K)
    {
        // Write your code here
         Graph g = new Graph(K);
		 
		 for(int i=0;i < words.length && i+1 < words.length;i++) {
				String w1 = words[i];
				String w2 = words[i+1];
				compare(g,w1,w2);	
			}
		 
		 return g.topologicalSort(); 
        
    }
    
    	private static void compare(Graph g, String word1, String word2) {
		// TODO Auto-generated method stub
	
		int m =0; int n =0;
		while(m < word1.length() && n < word2.length()) {
		
			if(word1.charAt(m) != word2.charAt(n)) {
		
				// Add edge from m to n
				if(!g.isConnected(word1.charAt(m)-'a', word2.charAt(n) -'a')) {
					g.addEdge(word1.charAt(m)-'a', word2.charAt(n) -'a');
					break;
				}
			}
			m++;n++;
		}
	}
}

class Graph{
	
	// Number of vertices
	int V;
	ArrayList<ArrayList<Integer>> list;
	ArrayList<ArrayList<Character>> clist;
	
	Graph(int V){
		
		list = new ArrayList<ArrayList<Integer>>(V);
		this.V = V;
		for(int i=0;i< V;i++) {
			list.add(new ArrayList<Integer>());
		}
	}


	public String topologicalSort() {
		// TODO Auto-generated method stub
		
		boolean[] visited = new boolean[V];
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0;i< V;i++) {
			if(!visited[i]) {			
				topologicalSortRec(list, list.get(i), stack, visited, i);

			}
			
		}
		String result = "";
		while(!stack.isEmpty()) {
			result = result + (char)(stack.pop() + 'a');
		}
//		System.out.println(result);
		return result;
	}

	private void topologicalSortRec(ArrayList<ArrayList<Integer>> list2, ArrayList<Integer> arrayList, Stack<Integer> stack, boolean[] visited, int i2) {
		// TODO Auto-generated method stub



		visited[i2] = true;
		for(int i=0;i< arrayList.size();i++) {
			
			if(!visited[arrayList.get(i)]) {

				topologicalSortRec(list2, list2.get(arrayList.get(i)), stack, visited, arrayList.get(i));
			}
		}


		stack.push(i2);

	}

	public void addEdge(int u, int v) {
		list.get(u).add(v);
	}

	public boolean isConnected(int u, int v) {
		
		for(Integer list : list.get(u)) {
		
			if(list == v) {
				return true;
			}
		}
		
		return false;
	}
}
