import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class CurrencyExchange {

	public static void main(String args[]) {
	
		int[] denominations = {5, 10, 25, 100, 200};
		System.out.println(canGetExactChange(75, denominations));
	}
	
	public static boolean canGetExactChange(int targetMoney, int[] denominations) {
	    // Write your code here
	
		return canGetExactChangeHelper(targetMoney, denominations, targetMoney, false);
		
	  }
	
	
	public static boolean canGetExactChangeHelper(int targetMoney, int[] denominations, int remaining, boolean result) {
	    // Write your code here
	    
		if(remaining == 0) {
			System.out.println("*********** found **********");
			
			return true;
		}
		
		if(remaining > targetMoney || remaining < 0) {
			return false;
		}

		for(int i=0;i< denominations.length;i++) {

			boolean ans = canGetExactChangeHelper(targetMoney, denominations, remaining - denominations[i], false);
			 result =  result || ans;
			}
		
		return result;
	  }
}
