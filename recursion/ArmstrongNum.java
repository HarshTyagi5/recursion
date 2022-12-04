package recursion;
// to check number is armstrong or not...
import java.util.Scanner;

public class ArmstrongNum {
	
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
	
	static boolean armStrong(int num, int digit) {
		
		return num==check(num,digit);
	}
	
	static int check(int num,int digit) {
		if(num==0) {
			return 0;
		}
		int rem=num%10;
		return (int)Math.pow(rem,digit) + check(num/10,digit);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check");
		int num = sc.nextInt();
		
		int digit = countDigit(num);
		System.out.println(armStrong(num,digit));
		sc.close();
	}

}
