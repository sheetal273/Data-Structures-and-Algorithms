import java.util.ArrayList;
import java.util.Scanner;

public class FindPivot {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int n = scanner.nextInt();
	
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			arr.add(scanner.nextInt());
		}
		
		int mid, l, r;

		mid = arr.size()/2;
		l = 0;
		r = arr.size()-1;
		int el;
		System.out.println("Search element : " );
		el = scanner.nextInt();
		
		binarySearch(arr, l, r, el);
		//int pivot = findPivot(arr, l, r, mid);
	/*	System.out.println("Pivot: "+ pivot);
		l = 0;
		r = arr.size()-1;

		System.out.println("**l and  r :" + l + " " + r + "pivot: "+arr.get(pivot));
		if(arr.get(pivot) == el) {
			System.out.println("Element Found ! " + pivot);
		}
		
		else if(arr.get(0) <= el) {

			System.out.println("first if");
			binarySearch(arr, l, pivot-1,el);
		}else {

			System.out.println("second if");
			binarySearch(arr, pivot+1, r, el);
		}
		*/
	}

static int binarySearch(ArrayList<Integer> arr, int l, int r, int el) {

	int pivot = findPivot(arr, 0, r);
	 if (pivot == -1) 
		    return binarySearch(arr, 0, r, el);
	 
	if(arr.get(pivot) == el) {
		System.out.println("Element Found ! " + pivot);
	}
	
	else if(arr.get(0) <= el) {

		//System.out.println("first if");
		binarySearch(arr, 0, pivot-1,el);
	}else {

		//System.out.println("second if");
		binarySearch(arr, pivot+1, r, el);
	}
//	System.out.println("()l and  r :" + l + " " + r);
/*	if(r >= l) {
		
		int mid = l+(r-1)/2;
	//	System.out.println("l and  r :" + l + " " + r);
		if(arr.get(mid) == el) {
			System.out.println("Found element at : " + mid);
			return mid;
			//break;
		}
		
		if(el > arr.get(mid)) {
			//l = mid + 1;
			binarySearch(arr, mid+1, r, el);
		}
		else {
			//r = mid - 1;
			binarySearch(arr, l, mid-1, el);
		}
	}
	
	*/
	return 0;
}
static int findPivot(ArrayList<Integer> arr, int l, int r) {

	while(l <= r) {
		
		//System.out.println("l, r and mid : " + l + " "+ r + " "+ mid);


		if(r < l) {
			return -1;
			//System.out.println("Array not rotated !");
		}
		
		if(r == l) {
			System.out.println("Pivot element :" + l);
			return l;
		}

		int mid = (l+r)/2;
	
		if(mid+1 > r && mid-1 < l) {
			System.out.println("Pivot element Not Found !");
			return -1;
		}
		
		
		if(arr.get(mid) > arr.get(mid+1)) {		
			//System.out.println("Pivot element is at location : " + (mid));
			return mid;
		}
		
		if(arr.get(mid) < arr.get(mid-1)) {
			//System.out.println("Pivot element is at location : " + (mid-1));
			return (mid-1);
		}
		
		if(arr.get(l) >= arr.get(mid)) {
			r = mid - 1;
			
		}
		else  {
			l = mid + 1;
		}
	}

	return -1;
}


}
