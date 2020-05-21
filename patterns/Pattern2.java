
package patterns;
import java.util.*;
import java.io.*;


public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of n");
    
		 	Scanner s = new Scanner(System.in);
		 	
		 	int n = s.nextInt();
		 	System.out.println();
		 	
		 	for(int i =n;i>=1;i--) {
		      
		 		for(int j =1;j<=i;j++)
		 			System.out.print("*\t");
		 			
		 		System.out.println();
		 		}
		 	}
	}

