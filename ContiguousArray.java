import java.util.HashMap;
import java.util.Stack;

public class ContiguousArray {

	public int findMaxLength(int[] nums) {
		
		if(nums.length == 0) {
			return 0;
		}
		
	
		for(int i=0;i< nums.length;i++) {
			if(nums[i] == 0) {
				nums[i] = -1;
			}
		}
		
		int SMAX=0;
		int count = 0; int max = 0;
		
		
		for(int i=0;i< nums.length;i++) {
			
		
			max = nums[i];
			int lastZero = -1;
			int j;
			for(j=i+1;j< nums.length;j++) {
				
				max = max + nums[j];
				count =0;
				
				if(max == 0) { 
					lastZero = j;
			
				}
			}
			
			if(lastZero !=-1) {
				count = count + (lastZero - i)+1;
			}

			if(count > SMAX) {
				SMAX = count;
			}
			System.out.println("count for "+ i + " =  " + count);
			
		}
		
		return SMAX;	

    }
	


	public int findMaxLength2(int[] nums) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, -1);
		int count =0;int max_length=0;
		for(int i=0;i< nums.length;i++) {
		
			if(nums[i] == 0) {
				count = count + -1;
			}
			if(nums[i] == 1) {
				count = count +1;
			}
			if(map.containsKey(count)) {
				max_length = Math.max(max_length, i - map.get(count));
			}else{
				map.put(count, i);
			}
			
		}
		
		
		
		
		
		return max_length;
		
	}
	
	public static void main(String args[]) {
		
		int[] nums = {0,0,1,0,0,0,1,1};
		ContiguousArray obj = new ContiguousArray();
		System.out.println(obj.findMaxLength(nums));
	}
}
