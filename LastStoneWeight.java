import java.util.ArrayList;

public class LastStoneWeight {

	 public int lastStoneWeight(int[] stones) {
	        
		if (stones.length == 0) {
			return 0;
		}

		if (stones.length == 1) {
			return stones[0];
		}

		int count =0;
		while (stones.length > 1) {
			int max = stones[0], smax = stones[1];
			
			if(stones[0] > stones[1]) {
				max = 0;
				smax = 1;
			}else {
				max = 1;
				smax = 0;
			}
			for (int j = 2; j < stones.length; j++) {
				
				if (stones[j] > stones[max] && stones[j] > stones[smax]) {
					if(stones[max] > stones[smax]) {
						smax = max;
					}
					max = j;
				} else if (stones[j] > stones[max] && stones[j] < stones[smax]) {
					max = j;
				}else if(stones[j] > stones[smax]) {
					smax = j;
				}
			}
	
			ArrayList<Integer> temp = new ArrayList<Integer>();
			boolean checked = false;
			
			int k = 0;
			int c =0;
			for (int i = 0; i < stones.length; i++) {

			
				if(i != max && i != smax) {
					temp.add(stones[i]);
				}
				else if(i == max && stones[max] != stones[smax]) {
					temp.add(stones[max] - stones[smax]);	
				}
			}
			
			
			stones = new int[temp.size()];
			for(int item : temp) {
				stones[k++] = item;
			}
			temp.clear();
			
		}
		return stones.length > 0 ? stones[0] : 0;
	}
	
	 
	 
	public static void main(String ags[]) {
	
		LastStoneWeight obj = new LastStoneWeight();
		int[] arr = {4,6,4,10};
		System.out.println("\nWeight of last item: "+ obj.lastStoneWeight(arr));
	}
	
}
