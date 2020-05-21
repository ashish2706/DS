package patterns;
import java.util.*;


public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		
		int n = s.nextInt();
		
		System.out.println();
		int val = 1;
		
		for(int i =1;i<=n;i++)
		{
			for(int j =1;j<=i;j++)
			{
				System.out.print(val+"\t");
				val++;
			}
			System.out.println();
		}
		
	}

}
