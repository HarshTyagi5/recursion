package recursion;

import java.util.Scanner;

public class PrimeNum {
	
	static int isprime(int num,int i) {
		
		if(num==1||num==0) {
			return 0;
		}
		
		if(i==1) {
			return 1;
		}
		if(num%i==0) {
			return 0;
		}
		
		return isprime(num,i-1);
	}
	
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int res = isprime(num,num/2);
		if(res==0)
			System.out.println("number is not prime");
		else
			System.out.println("number is prime");
		sc.close();
	}
}
