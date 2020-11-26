class Solution {
    public boolean canBeEqual(int[] array_a, int[] array_b) {
        	HashMap<Integer, Integer> map = new HashMap<>();
		for(int n: array_a) {
			
			if(map.containsKey(n)) {
				int val = map.get(n);
				map.put(n, val+1);
			}
			else {
				map.put(n, 1);
			}
		}
		
		for(int n: array_b) {
			
			if(map.containsKey(n) && map.get(n) > 0) {
				int val = map.get(n);
				map.put(n, val-1);
			}else {
				return false;
			}
		}
		
		return true;
    }
}
