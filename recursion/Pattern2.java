package recursion;

public class Pattern2 {
	
static void pattern(int i, int j) {
		
		if(i==0) return;
		
		print(j);
		
		pattern(i-1,j+1);
	}
	
	static void print(int row) {
		
		if(row==0) {
			System.out.println();
			return ;
		}
		System.out.print("row");
		print(row-1);
		
		 	
	}

	public static void main(String[] args) {
	
			print(5);
	}

}
