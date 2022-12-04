package recursion;

public class PalindromeOfNum {
	
	static int countDigit(int num) {
		// termination condition
		
		if(num==0) {
			return 0;
		}
		
		// Recursion
		
//		int count = countDigit(num/10);
//		count=count+1;
//		return count;
		
		return countDigit(num/10)+1;
	
	}
	
static int helper(int num, int digit) {
		
		if(num%10 == num) {
			return num;
		}
		int rem = num%10;
		return rem * (int)Math.pow(10, digit-1) + helper(num/10,digit-1);
		
	}
	
	static int reverse(int num) {
		
		// to count the digits of a number we use this one line code
		int digits = countDigit(num);
		
		return helper(num,digits);
	}
	
	static boolean palindrome(int num) {
		return num == reverse(num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(palindrome(125321));
	}

}
