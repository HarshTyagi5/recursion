package recursion;

public class SumOfDigits {

	static int[] sum(int num , int count) {
		
		if(num==0) {
			int [] arr =new int[2];
			return arr;
		}
		
		int arr[] = sum(num/10,count+1);
		if(count%2==0) {
			arr[0]	=arr[0] + num%10;
		}
		else
			arr[1]	=arr[1] + num%10;
		return arr;
	}
	
	static int sumofdigit(int num) {
		
		if(num==0)
			return 0;
		
//		int sum = sumofdigit(num/10);
//		sum+=num%10;
//		return sum;
		
		return num%10 + sumofdigit(num/10);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = sum(1234532,0);
//		System.out.println(arr[0]+" "+ arr[1]);
		
		int res = sumofdigit(123456);
		System.out.println(res);
	}

}
