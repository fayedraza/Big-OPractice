////////////////////////////////////////

// Created by Fayed Raza

////////////////////////////////////////

public class worstcaseon2 {
	 public static void main (String [] args) {
		 
		//purpose is to show examples of 0(n^2) time complexity in java	 
		 
		 //example 1
		 for(int test = 7; test<8; test++)
			 for(int test2 = 20; test2<50; test2++) {
				 System.out.println("testing O(n^2)");
			 }
		 
		//example 2 (worst case edition)
			
         String test[] = {"cat", "fish", "dog"};
		 
		 for( String s : test) {
			 if(s == test[test.length - 1])
				 System.out.println("We found the element " + test[test.length - 1]);
		 }
		
		 
		//example 3
		  //insertion sort
		 int insertionsorttest [] = {3,24,2,31,5};
		 { 
		 int n = insertionsorttest.length;  
	        for (int j = 1; j < n; j++) {  
	            int key = insertionsorttest[j];  
	            int i = j-1;  
	            while ( (i > -1) && ( insertionsorttest [i] > key ) ) {  
	            	insertionsorttest [i+1] = insertionsorttest [i];  
	                i--;  
	            }  
	            insertionsorttest[i+1] = key;  
	        }  
	            for( int finalvalue: insertionsorttest) {
	            	 System.out.print(finalvalue +" ");
	            }
		 
				 
		 }
		 
		 
	 }

}
