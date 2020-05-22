package patterns;
import java.util.*;

public class Pattern16 {
	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		System.out.println("Enter the number of rows");
		
		int n =  s.nextInt();
		
		int innerspaces = 2*n-3;
		int stars = 1;
		
		for(int i =1;i<=n;i++){   
			for(int k =1;k<=stars;k++)
				System.out.print(k+"\t");
			
			for(int j =1;j<=innerspaces;j++)
				System.out.print("\t");
			
			if(i==n)
				stars--;
			
			for(int j=stars;j>=1;j--)
				System.out.print(j+"\t");
				
			innerspaces -=2;
			stars +=1;
			
		System.out.println();
		}	
	}
}
