package recursion;

public class Pattern {
	
	
	static void pattern(int i, int j) {
		
		if(i==0) return;
		
		space(i-1);
		print(j);
		
		pattern(i-1,j+1);
	}
	
	static void print(int row) {
		
		if(row==0) {
			System.out.println();
			return ;
		}
		System.out.print("*");
		print(row-1);
		 	
	}
static void space(int row) {
		
		if(row==0) {
			return ;
		}
		System.out.print(" ");
		space(row-1);
		 	
	}

	public static void main(String[] args) {
		
		pattern(5,1);

	}

}
