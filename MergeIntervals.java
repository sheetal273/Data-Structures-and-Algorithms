import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class MergeIntervals {

	public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {

		ArrayList<Interval> arr = new ArrayList<Interval>(intervals.size()+1);
		
		int pos=-1;
		for(int i=0; i<intervals.size(); i++) {
		//	arr.add(intervals.get(i));
			if(intervals.get(i).end > newInterval.start && i+1 < intervals.size() &&
					intervals.get(i+1).start > newInterval.end) {
				System.out.print("In first if \n");
				Interval ii = new Interval(intervals.get(i).start, newInterval.end);
				arr.add(ii);
			}
			else if(intervals.get(i).end < newInterval.start && i+1 < intervals.size() &&
					newInterval.end < intervals.get(i+1).start) {
				System.out.print("In second if \n" + (i+1));
				arr.add(i, newInterval);
				pos=i+1;
			}
			
			else if(intervals.get(i).end > newInterval.end &&
					intervals.get(i).start < newInterval.start) {
				// Skip new interval addition
				System.out.print("skipping addition \n");
			}
			else {
				arr.add(intervals.get(i));
			}
			//else 
		}
		
		for(Interval ii : arr) {
			System.out.print(" [" + ii.start + ", " + ii.end + "] ");
		}
		return arr;
    }
	
	public static void main(String args[]) {
		
		MergeIntervals obj = new MergeIntervals();
		Interval i1 = new Interval(1,2);
		Interval i2 = new Interval(6,9);
		
		ArrayList<Interval> arr = new ArrayList<Interval>();
		arr.add(i1);
		arr.add(i2);
		
		Interval i3 = new Interval(3,5);
		obj.insert(arr, i3);
		
	}
}

class Interval{
	
	int start;
	int end;
	
	Interval(){
		start =0;
		end =0;
	}
	
	Interval(int s, int e){
		start=s;
		end=e;
	}
}