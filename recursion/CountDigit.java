package recursion;
import java.util.Scanner;
public class CountDigit {
		static int countDigit(int num) {
			// termination condition
			
			if(num==0) {
				return 0;
			}
			
			// Recursion
			
//			int count = countDigit(num/10);
//			count=count+1;
//			return count;
			
			return countDigit(num/10)+1;
		
		}
		static void countDigits(int num, int count) {
			
			//termination condition
			
			if(num==0) {
				System.out.println(count);
				return;
			}
			
			
			//recursion
			countDigits(num/10,count+1);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		int count=countDigit(num);
		System.out.println(count);
		sc.close();
	}

}
