import java.util.*;

public class CombinationSum {

	public static void main(String[] args) {
		
		int[] arr = {2,3,5};
		int target = 8;
			
		combinationSum(arr, target);
		
	}
	
	
	private static List<List<Integer>> combinationSum(int[] arr, int target) {
		// TODO Auto-generated method stub
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> t = new ArrayList<Integer>();
		
		combinationSum(list, new ArrayList<>(), arr, target, 0);
		
		for(List<Integer> l: list) {
		
			System.out.println(" " + l);
		}
		
		return list;
	}


	public static List<List<Integer>> combinationSum(List<List<Integer>> list, List<Integer> c_list, int[] candidates, int target, int index) {
	      
		
		 if(target == 0) {
			 
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
