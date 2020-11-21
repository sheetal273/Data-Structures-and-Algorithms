class Sum
{
    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> arr, int target)
    {
        // add your code here
         ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
			List<Integer> t = new ArrayList<Integer>();
			
			 Collections.sort(arr);
			 int[] ret = new int[arr.size()];
			    for (int i=0; i < ret.length; i++)
			    {
			        ret[i] = arr.get(i).intValue();
			    }
			combinationSum(list, new ArrayList<>(), ret, target, 0);
			
             Set<Integer> hashSet = new LinkedHashSet(list);
			 list = new ArrayList(hashSet);
			
			return list;
    }

    
	public static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<ArrayList<Integer>> list, List<Integer> c_list, int[] candidates, int target, int index) {
	      
		
		 if(target == 0) {
	//		 Collections.sort(c_list);
			 list.add(new ArrayList(c_list));  

		 }
		 else if(target > 0) {

			 for(int i =index ;i < candidates.length;i++) {

				 c_list.add(candidates[i]);
				 combinationSum(list, c_list, candidates, target-candidates[i], i);
				 c_list.remove(c_list.size()-1);
			 }
		 }
	 
		
		 return list;
	 }
}

