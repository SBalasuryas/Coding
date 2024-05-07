package cse;
import java.util.*;
import java.util.Scanner;
public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
 		int a = sc.nextInt();
		
 		/*
		for(int row=1;row<a;row++) {
			for(int col=0;col<a;col++) {
				System.out.print("*");
				}
			System.out.println();
			}
Output: 		
5
*****
*****
*****
*****
			
 		for(int row=0;row<=a;row++) {
			for(int col=0;col<row;col++) {
				System.out.print("*");
				}
			System.out.println();
			}
 		5

 		*
 		**
 		***
 		****
 		*****
 		
 		
 		
 		
 		for(int row=0;row<=a;row++) {
			for(int col=row;col<=a-1;col++) {
				System.out.print("*");
				}
			System.out.println();
			}
 		
 		5
 		*****
 		****
 		***
 		**
 		*
 		
 		
 		
 		for (int row=0; row<a; row++)   
 		{  
 		//inner loop work for space      
 			for (int col=a-row; col>1; col--){  
 				//prints space between two stars  
 				System.out.print(" ");   
 				}   
 				//inner loop for columns  
 			for (int col=0; col<=row; col++ ){   
 				//prints star      
 				System.out.print("*");   
 				}   
 			//throws the cursor in a new line after printing each line  
 			System.out.println();   
 		}   
 		
 		
5
    *
   **
  ***
 ****
*****
 		
 		
 		
 		
 		
 		
 		
 		
 		for(int row=0;row<=a;row++) {
			for(int col=row;col<=a-1;col++) {
				System.out.print(" ");
				}
			for(int row = a;row<=a;row++) {
				System.out.println();
				}
 			}
 		
 		for (int row=0; row<a; row++)   
 		{  
 		//inner loop work for space      
 			for (int col=a-row; col>1; col--){  
 				//prints space between two stars  
 				System.out.print(" ");   
 				}   
 				//inner loop for columns  
 			for (int col=0; col<=row; col++ ){   
 				//prints star      
 				System.out.print("* ");   
 				}   
 			//throws the cursor in a new line after printing each line  
 			System.out.println();   
 		}   
 		
 		
 		
 		5
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 		
 		ERROR
 		
 		
 		
 		for (int row=0; row<a; row++)   
 		{  
 		//inner loop work for space      
 			for (int col=a-row; col>1; col--){  
 				//prints space between two stars  
 				System.out.print(" ");   
 				}   
 				//inner loop for columns  
 			for (int col=0; col<=row-1; col++ ){   
 				//prints star      
 				System.out.print("* ");   
 				}   
 			//throws the cursor in a new line after printing each line  
 			System.out.println();   
 		}   
 		for (int col=a-row; col>1; col--){  
				//prints space between two stars  
				System.out.print(" ");   
				}   
		for(int row=0;row<=a;row++) {
			System.out.print(" *");
			}
			for(int col=row;col<=a-1;col++) {
				System.out.print(" ");
				}
			System.out.println();
			}
			
			
			
 		
 		int t=1;
		for(int row=0;row<a;row++){
		    for(int col=row;col<a-1;col++){
		        System.out.print(" ");
		    }
		    for(int col=0;col<t;col++){
		        System.out.print("*");
		    }
		    t=t+2;
		    System.out.println();
		}

		
		output: 
		5
	    *
	   ***
	  *****
	 *******
	*********
	
	
	
 		for(int row=0;row<a;row++){
		    for(int col=0;col<a;col++){
		        System.out.print(row+1);
		    }
		    System.out.println();
		}


5

11111
22222
33333
44444
55555

 		for(int row=0;row<a;row++){
		    for(int col=row;col<a;col++){
		        System.out.print(row+1);
		    }
		    System.out.println();
		}
		
5
11111
2222
333
44
5
	
	
 		for(int row=1;row<=a;row++){
 			if(row==1||row==5) {
 				System.out.println("*******");
 			}
 			else {
 				System.out.println("*     *");
 			
		}
5
*******
*     *
*     *
*     *
*******

		
		
		
 		int t;
 		for(int row=0;row<a;row++) {
 		
 		t=((row+1)%2==0)?2:1;
 		
 			if((row+1)%2==0) {
 				t=2;
 			}
 			else {
 				t=1;
 			}
 			for(int col=0;col<=row;col++) {
 				System.out.print(t);
 				t=t+2;
 			}
 			System.out.println();
 		}

 		5
 		1
 		24
 		135
 		2468
 		13579
 		
 		
 		
 		
 		
 		
 		
 		for (int row=0; row<a; row++)   
 		{      
 			for (int col=0; col<a; col++){  
 				if(col==0||col==a-1||(row==col&&row<=a/2)||(row+col==a-1&&row<=a/2)) {
 					System.out.print("*");   
 					} 
 				else 
				System.out.print(" ");
 			}
 			System.out.println();
 		}	
 		
 		
 		
 		
 		5
 		*   *
 		** **
 		* * *
 		*   *
 		*   *
 		
 		
 		
 		
 		
 		for(int row=1-a;row<a;row++){
		    for(int col=1-a;col<a;col++){
		        if(Math.abs(row)>Math.abs(col))
		        System.out.print(Math.abs(row)+1);
		        else
		        System.out.print(Math.abs(col)+1);
		    }
		    System.out.println();
		}

 		
 		 
 	
 		int t=1,v=1;
        for(int row=1;row<=a;row++){
          for(int col=0;col<t;col++){
              System.out.print("*");
          }
          t=t+v;
          if(t>=(a/2)+1)
              v=-1;
        }
        System.out.println();
	}
       }






 	
	
	
	
5
    * 
   * *  
  * * * 
 * * * * 
* * * * * 



*/
 		int t=1,v=1;
        for(int row=1;row<=a;row++){
          for(int col=0;col<t;col++){
              System.out.print("*");
          }
          t=t+v;
          if(t>=(a/2)+1)
              v=-1;
        }
        System.out.println();
	
       }



	}
}
