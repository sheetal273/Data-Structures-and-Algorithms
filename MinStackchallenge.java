import java.util.ArrayList;
import java.util.Stack;

public class MinStackchallenge {
	
	Stack<Integer> minStack;
	Stack<Integer> stack;
	
	/** initialize your data structure here. */
    public MinStackchallenge() {
        
    	minStack = new Stack<Integer>();
    	stack = new Stack<Integer>();
    }
    
    public void push(int x) {
        stack.push(x);
        
        if(minStack.isEmpty()) {
        	minStack.push(x);
        } else {
        	
        		  ArrayList<Integer> temp = new ArrayList<Integer>();
        	        while(!minStack.isEmpty() && minStack.peek() < x) {
        	        	int v = minStack.pop();
        	        	System.out.println("Popping :"+ v + " for x: "+ x);
        	        	temp.add(v);
        	        }
        	        if(!minStack.isEmpty()) {
        	        	//minStack.pop();
        	        	 System.out.println(" Min stack peek  : "+ minStack.peek());
        	        }
        	        

        	        minStack.push(x);
        	
        	     /*   for(int item: temp){
        	        	System.out.println("temp : "+ item);
        	        	minStack.push(item);
        	        }*/
        	        for(int i=temp.size()-1;i>=0;i--) {
        	        	System.out.println("temp : "+ temp.get(i));
        	        	minStack.push(temp.get(i));
        	        }

         	       
        	        System.out.println("minstanck size: "+ minStack.size() + " peek "+ minStack.peek());
        }
     //   System.out.println(" Min stack peek now fatre inserting : "+ x + " : "+ minStack.peek());
    }
    
    public void print() {
    
    	while(!minStack.empty()) {
    		System.out.print(" " + minStack.peek());
    		minStack.pop();
    	}
    }
    
    public void printS() {
        
    	for(int i=0;i< stack.size();i++) {
    		System.out.print(" " + stack.pop());
    	}
    }
    
    public void pop() {
    	int val = Integer.MIN_VALUE;
        if(!stack.isEmpty()) {
        	val = stack.pop();
        }
     //   System.out.println("popped : "+ val + " size:"+ minStack.size());
        
        ArrayList<Integer> temp = new ArrayList<Integer>();
        while(!minStack.isEmpty() && minStack.peek() != val) {
        	temp.add(minStack.pop());
        }
   //     System.out.println("peek : "+ minStack.peek());
        if(!minStack.isEmpty()) {minStack.pop();
        }
       // minStack.pop();
      /*  for(int item: temp){
        	minStack.push(item);
        }*/
        
        for(int i=temp.size()-1;i>=0;i--) {
        	minStack.push(temp.get(i));
        }
    }
    
    public int top() {
        
    	if(!stack.isEmpty()) {
    		return stack.peek();
    	}
    	return Integer.MIN_VALUE;
    }
    
    public int getMin() {
     
    	if(!minStack.isEmpty()) {
    		return minStack.peek();
    	}
    	return Integer.MIN_VALUE;
    }
    
    public static void main(String[] args) {
    	
    	MinStackchallenge minStack = new MinStackchallenge();

    	System.out.println(" output :" + minStack.getMin());   
    	minStack.push(2);
    	minStack.push(0);
    	minStack.push(3);
    	minStack.push(0);
    //	System.out.println("Printing stack ***" );
    
   
    	System.out.println(" output :" + minStack.getMin());   
    	minStack.pop();
    	System.out.println(" output :" + minStack.getMin());  
    	minStack.pop();
    	System.out.println(" output :" + minStack.getMin());  
    	minStack.pop();
    	System.out.println(" output :" + minStack.getMin());  
    //	minStack.print();
   /* 	minStack.pop();
    	System.out.println(" output :" + minStack.getMin());   
    	minStack.pop();
    	
   // 	System.out.println("Top = " + minStack.top());  
    	System.out.println(" output "+ minStack.getMin());*/
    }
}
