package patterns;
import java.util.*;


public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n = s.nextInt();
		
		for(int i =1;i<=n;i++)
		{
			for(int j = 1;j<=n;j++)
			{
				if(i+j==n+1)
				System.out.print("*\t");
				
				else
					
				System.out.print("\t");
			}
			System.out.println();
		}
		

	}

}
