package recursion;

public class CountZero {
	
	static int countZero(int num) {
		
		if(num/10==0) {
			
			return 0;
		}
		
		int count=countZero(num/10);
		
		int rem = num%10;
		if(rem==0) {
			
			count++;
			
		}
		return count;
			
	}

	public static void main(String[] args) {
		
			System.out.println(countZero(10010000));
	}

}
