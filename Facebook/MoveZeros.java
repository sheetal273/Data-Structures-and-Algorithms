
public class MoveZeros {

	
	public static void main(String[] args) {
		
		int[] n = {0,1,9,0,3,12, 0};
		
		moveZeroes(n);
	}
	
	public static void moveZeroes(int[] nums) {
        
		int count =0;
		for(int i =0;i< nums.length;i++) {
			
			if(nums[i] == 0) {
				count ++;
			}
		}
		
		int last_non_zero = 0;
		for(int i =0;i< nums.length;i++) {
			
			if(nums[i]!=0) {
				nums[last_non_zero] = nums[i];
				last_non_zero++;
			}
			
			

		}
		

		
		for(int i= nums.length-count;i< nums.length;i++) {
			nums[i] =0;
		}

		
    }

}
