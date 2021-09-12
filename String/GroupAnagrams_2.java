import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

	public static void main(String[] args) {
		
		String arr[] = {
				   "cat",
				   "dog",
				   "tac",
				   "god",
				   "act",
				   "tom marvolo riddle ",
				   "abc",
				   "def",
				   "cab",
				   "fed",
				   "clint eastwood ",
				   "i am lord voldemort",
				   "elvis",
				   "old west action",
				   "lives"
				  };
		System.out.println(groupAnagrams(arr));
				  
	}
	
	static String groupAnagrams(String[] arr) {
		
		HashMap<String, List<String>> wordsMap = new HashMap<>();
		
		for(String str : arr) {
			
			char tempArray[] = str.toCharArray();
			Arrays.sort(tempArray);
			
			String newword = new String(tempArray);
			if(wordsMap.containsKey(newword)) { 
				wordsMap.get(newword).add(str);
			}
			else { 
				
				List<String> list = new ArrayList<>();
				list.add(str);
				wordsMap.put(newword, list);
			}	
		}
		
		String anagrams = "";
		for(String key : wordsMap.keySet()) {
			
			List<String> values = wordsMap.get(key);
			if(values.size()> 1) {
				anagrams = anagrams + values;
			}
			
		}
		return anagrams;
	}
}
