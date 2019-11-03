package GoogleInterviewQuestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GasStation {
	 
	 public int canCompleteCircuit(final List<Integer> A, final List<Integer> B) {
		
		 for(int i=0;i< A.size();i++) {
			 int[] visited = new int[A.size()];
			 if(compute(A, B, visited, 0, i)) {
				return i;
			 }
		 }
		 return -1;
	 }
	 
	 public int checkOptimal(final List<Integer> A, final List<Integer> B) {
		 
		 int sum=0;int diff=0;int start=0;
		 for(int i=0;i<A.size();i++) {
			 
			 sum = A.get(i) - B.get(i);
			 if(sum < 0) {
				 start = i+1;
				 sum =0;
				 diff += sum;
			 }
		 }
		 return sum - diff >=0 ? start: -1;
	 }
	 public boolean compute(List<Integer> A, List<Integer> B, int[] visited, int fuel, int i) {
		 
		 if(i > A.size()-1 && visited[i-A.size()] == 0) {
			i = i-A.size();
			visited[i]=1;
		 }else if(i > A.size()-1) {
			 return true;
		 } 
		 if(fuel + A.get(i) - B.get(i) >=0) {
				 visited[i] = 1;
				 fuel = fuel + A.get(i) - B.get(i);
				 return compute(A, B, visited, fuel, i+1);
		 }
		return false;
	 }
	 
	public static void main(String args[]) {
		
		List<Integer> A = new ArrayList<Integer>();
		
		A.add(1);
		A.add(1);
		A.add(2);
		
		List<Integer> B = new ArrayList<Integer>();
		
		B.add(1);
		B.add(2);
		B.add(1);
		
		GasStation obj = new GasStation();
		System.out.println(obj.canCompleteCircuit(A, B));
		
		System.out.println("Answer :" + obj.checkOptimal(A, B));
		
	}
}
