package collections;

//import java.util.HashMap;

public class Hashmap {
	
	
	// ***to check the frequency of character in a string***
	
//	static HashMap<Character,Integer> frequency(String str, int index){
//		if(index == str.length()) {
//			HashMap<Character,Integer> map = new HashMap<>();
//			return map;
//		}
//		
//		char singleChar = str.charAt(index);
//		HashMap<Character,Integer> map = frequency(str,index+1);
//		
//		if(singleChar == ' ')
//			return map;
//		if(map.get(singleChar) == null) {
//			map.put(singleChar,1);
//		}
//		else {
//			int prevCount = map.get(singleChar);
//			map.put(singleChar,prevCount+1);
//		}
//		return map;
//	}
	
	
	//*** replace the pi with its value ***
	
	static String repPi(String str1,String str2, int index) {
		
		if(str1.length()==1)
			return str1;
		if(index==str1.length()) {
			return str2;
		}
		
		if(str1.charAt(index)=='p' && str1.charAt(index+1)=='i') {
			
				
				str2+="3.14";
				index+=1;
			}
			
		
		else {
			str2=str2+str1.charAt(index);
			
		}
		
		str2 =repPi(str1,str2,index+1);
		return str2;
	}
	
	
	
	//*** to replace xx with x*x and yy with y*y
	
	
	static String repx(String str1,String str2, int index) {
		boolean temp = false;
		if(str1.length()-1==index)	return str2;
		
		if(str1.length()<2)		return str1;
		
		char currentChar = str1.charAt(index);
		char nextChar = str1.charAt(index+1);
		if(currentChar == nextChar) {
			str2 = str2+currentChar+"*";
			index+=1;
			 temp = true;
		}
		
		else
			str2+=str1.charAt(index);
		if(temp)
			str2 = repx(str1,str2,index);
		else
			str2 = repx(str1,str2,index+1);
		return str2;
	}
	

	public static void main(String[] args) {
		// Find frequency of a character in a string
		
				String str1 = "ip*iipipi*p-i";
				String str3 = "xxixxyyxyjfxxxyy";
				String str="";
				String str2 = repPi(str1,str,0);
				 String str4 = repx(str3,str,0);
				 System.out.println(str2);
				System.out.println(str4+=str1.charAt(str1.length()-1));
//				
//				HashMap<Character,Integer> map = new HashMap<>();
//				
//				for(int i=0;i<str.length();i++) {
//					
//					char singleChar = str.charAt(i);
//					if(singleChar == ' ')
//						continue;
//					if(map.get(singleChar) == null) {
//						map.put(singleChar,1);
//					}
//					else {
//						int prevCount = map.get(singleChar);
//						map.put(singleChar,prevCount+1);
//					}
//				}
//				
//				System.out.println(map);
		
		//HashMap<Character,Integer> map = frequency(str,0);
		//System.out.println(map);

	}

}
