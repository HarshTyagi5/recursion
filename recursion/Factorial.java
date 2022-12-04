package recursion;

public class Factorial {
	
	static int factorial(int num) {
		
		//base condition
		
		if(num<2)
			return 1;
		
		//recursive call
		
		return num*factorial(num-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int res = factorial(5);
			System.out.println(res);
	}

}
