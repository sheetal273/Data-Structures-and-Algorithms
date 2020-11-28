class Solution {
    public int romanToInt(String s) {
        
		int final_number = 0;
		char lastchar = 0;
		for(int i=0;i< s.length();i++) {
			
			if(s.charAt(i) == 'I') {
				final_number += 1;
				lastchar = 'I';
			}
			if(s.charAt(i) == 'V') {
				
				if(lastchar == 'I') {
					final_number = final_number -2 + 5;
				}else {
					final_number += 5;
				}
				lastchar = 'V';
			}
			if(s.charAt(i) == 'X') {
				
				if(lastchar == 'I') {
					final_number = final_number -2 + 10;
				}
				else if(lastchar == 'V') {
					final_number = final_number - 10 +10;
				}else {
					final_number += 10;
				}
				
				lastchar = 'X';
			}
			if(s.charAt(i) == 'L') {
				
				if(lastchar == 'X') {
					final_number = final_number - 20+50;
				}else{
					final_number += 50;
					
				}
				
				lastchar = 'L';
			}
			if(s.charAt(i) == 'C') {
				
				
				if(lastchar == 'L') {
					final_number = final_number - 100+100;
				}if(lastchar == 'X') {
					final_number = final_number - 20+100;
				}else {
					final_number += 100;
					
				}
				lastchar = 'C';
			}
			if(s.charAt(i) == 'D') {
				
				if(lastchar == 'C') {
					final_number = final_number - 200+500;
				}else {
					final_number += 500;
				}
				lastchar = 'D';
			}
			if(s.charAt(i) == 'M') {
			
				if(lastchar == 'D') {
					final_number = final_number - 1000 + 1000;
				}if(lastchar == 'C') {
					final_number = final_number - 200+1000;
				}else {
					final_number += 1000;
				}
				lastchar = 'M';
			}
		}
		return final_number;
    }
}
