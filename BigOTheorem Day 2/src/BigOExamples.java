////////////////////////////////////////

// Created by Fayed Raza

////////////////////////////////////////



public class BigOExamples {
     public static void main (String[]args) {
    	//purpose is to show BigO runtime examples
     }
     
     //O(b) since it runs a linear amount of times
     int product(int a, int b) { 
    	 int sum = 0; 
         for (int i= 0; i < b; i++) { 
         sum += a; 
         } 
         return sum; 
     } 
     
    
     
//O(1) since the runtime will be constant no matter what the input is
     int mod(int d, int e) { 
         if (e <= 0) { 
             return -1; 
             } 
             int div = d / e;
			return d - div/e; 

     } 
     
     //O(a/b) runtime because it runs a/b times
     int div(int  a,int  b) { 
    	 
    		 int count = 0; 
    		 
    		 int sum =  b;
    		 
    		 while (sum <= a) 
    		 { 
    			 
    		 sum += b; 
    		 count++; 
    		 
    		 } 
    		 return count; 
     }
     }
