package recursion;

//import java.util.Scanner;

public class CheckSortArray {
	
	static boolean checksort(int array[], int size,int i) {
		if(i==size) {
			return true;
		}
		return array[i]<array[i+1] && checksort(array,size,i+1);
		
	}
	
	

	public static void main(String[] args) {
		
		int [] array = {1,2,4,3,5};
		System.out.println(checksort(array,array.length,0));
        
	}

}
