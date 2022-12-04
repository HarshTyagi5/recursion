package recursion;

import java.util.Scanner;

public class OneToN_Armstrong {
	
static int armStrong(int num, int digit) {
	
	return check(num,digit);
	
}
	
	static int check(int num,int digit) {
		if(num==0) {
			return 0;
		}
		int rem=num%10;
		return (int)Math.pow(rem,digit) + check(num/10,digit);
		 
	}
	
	static int oneToN_arm(int start, int end) {
		if(start>end) {
			return 0;
		}
		int digit = (int)Math.log10(start)+1;
		int res=check(start,digit);
		if(res==start) {
			System.out.println(start);
		}
		oneToN_arm(start+1,end);
		return 0;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the last number of 1 to N range");
		int num = sc.nextInt();
		
		oneToN_arm(1,num);	
		sc.close();
		
	}

}
