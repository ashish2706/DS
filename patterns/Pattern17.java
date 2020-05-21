package patterns;
import java.util.*;

public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s =  new Scanner(System.in);
		
		System.out.println("Enter the number of rows");
		int n =  s.nextInt();
		
		System.out.println();
		
		int outerspace = 2,stars = 1;
		
		for(int i =1;i<=n;i++)
		{
			if(i!=n/2+1) {
			for(int j =1;j<=outerspace;j++)
				System.out.print("\t");
			}
			
			else {
				for(int j =1;j<=outerspace;j++)
				System.out.print("*\t");
			}

			
			for(int k=1;k<=stars;k++)
				System.out.print("*\t");
			
			
				
			
			if(i<=n/2)
				stars = stars+1;
			else 
				stars = stars - 1;
			
			System.out.println();
		}
		
		

	}

}
