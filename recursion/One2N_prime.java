package recursion;

import java.util.Scanner;

public class One2N_prime {
	
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

	static int oneToN_prime(int start, int end) {
		if(start==end) {
			return 0;
		}
		
		int res = isprime(start,start/2);
		if(res==1)
			System.out.println(start);
		oneToN_prime(start+1,end);
		return 0;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number upto you want to print prime numbers");
		int num = sc.nextInt();
		oneToN_prime(2,num);
		
		
		sc.close();
	}

}
