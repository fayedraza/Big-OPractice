
////////////////////////////////////////

// Created by Fayed Raza

////////////////////////////////////////

public class bestcaseOn {
	 public static void main (String [] args) {
		//purpose is to show examples of 0(n) time complexity in java	 
		 
		//example 1
		 //best case as they found the element right away
		 //sequential search
		 int x[] = {1,2,3,4,5,6,7,8,9};
		 
		 for( int index: x) {
			 if(index == x[0])
				 System.out.println("We found the element " + x[0]);
		 }
		 
		 
		//example 2
		
         String test[] = {"cat", "fish", "dog"};
		 
		 for( String s : test) {
			 if(s == test[0])
				 System.out.println("We found the element " + test[0]);
		 }
		
		 //ex3 
		 print(7);
		 
		 //example 4
		 test(5);
		
		 
	 }
	 
	 
	 
	 //example 3
	 public static void print(int y) {
		 int x=0;
		while(x<y) {
			System.out.println("Testing 1 2 3");
			x++;
		}
		
		System.out.println("We have printed " + y + " amount of items.");
	 }
	 
	//example 4
	 public static void test(int n) {
		 for(int y =2;y<n;y++) {
			 System.out.println("Testing 1 2 3");
		 }
		 System.out.println("Done");
		 
		 
		 
	
   
	 }
	 
}
