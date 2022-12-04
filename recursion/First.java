package recursion;

public class First {
	//tail recursion
//	void print(int n) {
//		if(n==0) {
//			return;
//		}
//		
//		System.out.println(n);
//		print(n-1);
//	}
	
	
	//head recursion
	
//	void print(int n) {
//		if(n==0) {
//			return;
//		}
//		
//		print(n-1);
//		
//		System.out.println(n);
//		
//	}
	
	//Linear recursion
//	void print(int n) {
//		System.out.println(n);
//		if(n==0) {
//			return;
//		}
//		
//		print(n-1);
//		
//		System.out.println(n);
//		
//	}
	void print(int n) {
		
		if(n<1) {
			return;
		}
		
		if(n%2!=0)
			System.out.println(n);
		
		print(n-2);
		
		if(n%2==0) {
			System.out.println(n);
		}
		
		//print(n-2);
		
		System.out.println(n+1);
		
	}
	
	

	public static void main(String[] args) {
		
		First obj = new First();
		obj.print(5);

	}

}
