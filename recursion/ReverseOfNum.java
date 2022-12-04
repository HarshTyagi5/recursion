package recursion;

public class ReverseOfNum {
	
	static int helper(int num, int digit) {
		
		if(num%10 == num) {
			return num;
		}
		int rem = num%10;
		
		return rem * (int)Math.pow(10, digit-1) + helper(num/10,digit-1);
		
	}
	 
	static int reverse(int num) {
		
		// to count the digits of a number we use this one line code
		int digits = (int)Math.log10(num)+1;
		
		return helper(num,digits);
	}

	public static void main(String[] args) {
		System.out.println(reverse(12345));

	}

}
