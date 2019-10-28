import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SetMatrixZeros {

	public void setZeroes(ArrayList<ArrayList<Integer>> a) {
    
		HashMap<Integer, Integer> rowMap = new HashMap<Integer, Integer>(a.size());
		HashMap<Integer, Integer> colMap = new HashMap<Integer, Integer>(a.get(0).size());
		
		
		for(int i=0;i< a.size();i++) {
			for(int j=0; j< a.get(i).size(); j++) {
				
				if(a.get(i).get(j) == 0) {
					rowMap.put(i, -1);
					colMap.put(j, -1);
				
				}
			}
			System.out.print("\n");
		}
		
		for(int m : rowMap.keySet()) {

			int k=0;
			while(k < a.get(0).size()) {
				a.get(m).set(k++, 0);
			}
			
			
		
		}
		

		
		int n=0;
		for(int m : colMap.keySet()) {
			
			int w =0;
			while(w < a.size()) {

				a.get(w++).set(m, 0);
			}
		}
		System.out.print("\n\n");
		
		for(int i=0;i< a.size();i++) {
			for(int j=0; j< a.get(i).size(); j++) {
				System.out.print(" "+ a.get(i).get(j));
			}
			System.out.print("\n");
		}
		
	}
	
	public static void main(String args[]) {
		
	    ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		
		arr1.add(0);
		arr1.add(0);
		//arr1.add(0);
		//arr1.add(1);
		arr.add(arr1);
		
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		
		arr2.add(1);
		arr2.add(1);
		//arr2.add(1);
		//arr2.add(0);
		arr.add(arr2);
		
	/*	ArrayList<Integer> arr3 = new ArrayList<Integer>();
		
		arr3.add(0);
		arr3.add(0);
		arr3.add(0);
		arr3.add(0);
		arr.add(arr3);
	*/
		SetMatrixZeros obj = new SetMatrixZeros();
		//System.out.print("\nhello world");
		obj.setZeroes(arr);
	}
}
