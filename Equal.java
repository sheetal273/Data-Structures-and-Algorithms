import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Equal {
	
    public int[] equal(int[] A) {
    
        int A1, B1, C1, D1;
        HashMap<Integer,int[]> map = new HashMap<>();
        int k=0;

        ArrayList<ArrayList<Integer>> arrList = new ArrayList<ArrayList<Integer>>();
        
        for(int i=0;i< A.length;i++) {
            for(int j=i+1;j< A.length; j++) {
                
                int sum = A[i] + A[j];
                if(map.containsKey(sum)) {
                    C1 = i;
                    D1 = j;
                    
                    int[] temp = map.get(sum);
                    A1 = temp[0];
                    B1 = temp[1];
                    
                    if(A1 < B1 && C1 < D1 && A1 < C1 && B1 != D1 && B1 != C1 ) {
                    
                        ArrayList<Integer> tempList = new ArrayList<Integer>();
                        tempList.add(A1);
                        tempList.add(B1);
                        tempList.add(C1);
                        tempList.add(D1);
                        
                        arrList.add(tempList);
                        
                        k = k+1;
                    }
                     
                }
                if(!map.containsKey(sum)) {
                    int[] temp = new int[2];
                    temp[0] = i;
                    temp[1]= j;
                    
                    map.put(sum, temp);
                }
                
            }
        }
        Collections.sort(arrList, new comp());
        
        int[] a = new int[arrList.get(0).size()];
        int l=0;
        for(int n: arrList.get(0)) {
        	a[l++] = n;
        }
        
        return a;
    }
    
    public static void main(String[] args) {
    	
    	int[] A = {3, 4, 7, 1, 2, 9, 8};
    	Equal obj = new Equal();
    	System.out.println(obj.equal(A));
    }
}


class comp implements Comparator<ArrayList<Integer>>{

    @Override
    public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
        // TODO Auto-generated method stub
        
        int t1 = o1.get(0).compareTo(o2.get(0));

        int t2 = o1.get(1).compareTo(o2.get(1));

        int t3 = o1.get(2).compareTo(o2.get(2));

        int t4 = o1.get(3).compareTo(o2.get(3));
        
        if(t1 < 0 || ( t1 == 0 && t2 < 0 ) || (t1 == 0 && t2 == 0 && t3 < 0) || (t1 == 0 && t2 == 0 && t3 == 0 && t4 < 0 )) {
            return -1;
        }
        return 1;
    }
}