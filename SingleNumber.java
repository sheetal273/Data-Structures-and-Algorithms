
public class SingleNumber {

	public int singleNumber(int[] nums) {
     
		int happyNo = 0;
		for(int i=0;i<nums.length;i++) {
			
			happyNo = happyNo ^ nums[i];
		}
		
		return happyNo;
    }
	
	public static void main(String args[]) {
		
		SingleNumber obj = new SingleNumber();
		
		int[] nums = {1, 2, 2, 1, 3};
		System.out.println("happy number: " + obj.singleNumber(nums));
	}

}
