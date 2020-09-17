import java.util.HashMap;
import java.util.Map.Entry;

public class FindDuplicates {

	public static void main(String args[]) {
		
		char arr[] = {'a', 'b', 'c', 'a', 'f', 'b', 'h'};
				
		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
		
		for(char c: arr) {
			
			// Check if element is visited before
			if(hashmap.containsKey(c)) {
				System.out.println("Duplicate " + c);
				
				int currentCount = hashmap.get(c);
				hashmap.put(c, currentCount+1);
			
			} else {
				hashmap.put(c, 1);
			}
		}
		
		System.out.print("\n\nNon duplicate elements = >  ");
		for(Entry<Character, Integer> map: hashmap.entrySet()) {
		
			if(map.getValue()  < 2) {
				System.out.print("" + map.getKey());
			}
		}
	
		
	}
	
}
