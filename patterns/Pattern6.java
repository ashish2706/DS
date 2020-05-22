package patterns;
import java.util.*;

public class Pattern6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows");	
		int n = s.nextInt();
	
		System.out.println();
		
		int stars = n/2 + 1;
		int spaces = 1;
		
		for(int i =1;i<=n;i++){
			for(int j=1;j<=stars;j++) 
				System.out.print("*\t");
			
			for(int k = 1;k<=spaces;k++)
				System.out.print("\t");
			
			for(int j=1;j<=stars;j++) 
				System.out.print("*\t");
			
			if(i<=n/2){
				stars -= 1;
				spaces += 2; 
			}
			else {
				stars += 1;
				spaces -= 2;
			}
			System.out.println();
		}	
	}
}
