import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DuplicatesInArray {

	public int repeatedNumber(final List<Integer> a) {
		
		// int[] mem = new int[a.size()];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(a.size());
		
		for(int i=0;i< a.size();i++) {
			if(map.get(a.get(i)) != null) {
				return a.get(i);
			}else {
				map.put(a.get(i), 1);
			}
			
		}
		return -1;
	}
	
	public static void main(String args[]) {
		List<Integer> list =  new ArrayList<Integer>();
		list.add(0);
		list.add(0);
		list.add(0);
		list.add(0);
		list.add(0);
		DuplicatesInArray obj = new DuplicatesInArray();
		System.out.print("Duplicate number : " + obj.repeatedNumber(list));
	}
}
