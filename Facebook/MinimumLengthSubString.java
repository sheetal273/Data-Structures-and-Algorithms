class Solution {
    public String minWindow(String s, String t) {
        
		if(s.length() == 0 || t.length() == 0) {
			return "";
		}
		int count = 0;
		int[] letterCount = new int[128];
		for(char ch: t.toCharArray()) {
			++letterCount[ch];
		}
		String result = "";
		
		int left = 0;
		int minLength = Integer.MAX_VALUE;
		for(int right =0 ;right < s.length();++right) {
			
			if(--letterCount[s.charAt(right)] >= 0) {
				++count;
			}
			
			while(count == t.length()) {
				
				if(minLength > right -left +1) {
					minLength = right- left +1;
					result = s.substring(left, right+1);
				}
				
				
					
					if(++letterCount[s.charAt(left)] > 0) {
						--count;
					}
					
					++left;
				
			}
		}
		
		
		return result;
    }
}
