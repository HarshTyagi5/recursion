package recursion;

class CountSteps {
	
	static int countSteps(int num) {
		if(num==0) {
			return 0;
		}
		if(num%2!=0) {
			return (num-1)+1;
		}
		return (num/2)+1;
	}
	

	public static void main(String[] args) {
		
		System.out.println(countSteps(14));
	}

}
