package GoogleInterviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class MajorityElement {

	 public int majorityElement(final List<Integer> A) {
	    
		 HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		 int majority=0;
		 for(int i=0;i<A.size();i++) {
			 System.out.println("Checking for : "+ A.get(i));
			 if(map.containsKey(A.get(i))) {
				 System.out.println("Found the key : ");
				 int value = map.get(A.get(i));
				 map.put(A.get(i), value+1);
				 System.out.println("Key after increment : " + map.get(i));
			 }else {
				 System.out.println("Key not found!");
				 map.put(A.get(i), 1);
			 }
			 
		 }
		 int threshold = (int) Math.floor(A.size()/2);
		 for(Map.Entry<Integer, Integer> m: map.entrySet()) {
			 System.out.println("Map values :" + m.getKey() +"threshold :"+ threshold);
			 if(m.getValue() > threshold) {
			//	 if() {
				 System.out.println("Updating the majority :" + m.getKey());
				 majority = m.getKey();
				// }
			 }
		 }
		 
		 return majority;
	 }
	
	public static void main(String args[]) {
		List list = new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(2);
	//	list.add(0);
	//	list.add(3);
		
		MajorityElement obj = new MajorityElement();
		
		System.out.println(obj.majorityElement(list));
		
	}
}
