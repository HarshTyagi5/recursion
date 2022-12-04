package recursion;

import java.util.ArrayList;

public class SearchEle {
	
	//static int index=-1;
//	static int searchEle(int array[] , int ele) {
//		if(index > array.length-1)
//			return array.length+1;
//		if(array[index]==ele)
//			return index;
//		index+=1;
//		return searchEle(array,ele);
//		//return find;
//	}
		
	static ArrayList<Integer> searchEle(int arr[], int search,int index){
		if(index == arr.length) {
			ArrayList<Integer> l = new ArrayList<>();
			return l;
		}
		//index+=1;
		ArrayList<Integer> l = searchEle(arr,search,index+1);
				
		if(arr[index]==search) {
			l.add(index);
			
		}
		return l;
	}
	public static void main(String[] args) {
		
		int [] array = {10,20,30,40,50,10,50,30,20,10,10};
		int search = 10;
		 ArrayList<Integer> list= searchEle(array,search,0);
		
		System.out.println(list);
	}

}
