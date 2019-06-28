////////////////////////////////////////

// Created by Fayed Raza

////////////////////////////////////////

public class expectedcase {
	public static void main (String [] args) {
		
		
		//purpose is to show examples of 0(n*logn) time complexity in java	 
		 
		//example 1
		 test(1 );		//a value of at least 3 will cause this loop to run for a very long time
		
		 
		
		
		
		
	}
	//example 1
	
		 public static void test(int n) {
			 int s = 0;
			 for(int y =2;y<n;y++) 
				 for(int z =2;y<n;z*=2) {
					 s++;
					 System.out.println("Testing 1 2 3");
					 
				 }
			 System.out.println("This phrase has printed out " + s+ " times.");
			 
		
	   
		 }
	
	
	
}
