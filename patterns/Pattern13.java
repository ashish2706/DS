package patterns;
import java.util.*;


public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of rows");
		
		int n = s.nextInt();
		System.out.println();
		
		for(int i =1;i<=n;i++)
		{
			int fact = 1;
			for(int j =1;j<=i;j++)
			{ 
			 fact = (factorial(i-1)/(factorial(j-1) * factorial(i-j)));
				System.out.print(fact+"\t");
			}
			System.out.println();
		}
		

	}
	
	public static int factorial(int a) {
		
		int fact= 1;
		if(a<=0)
			return 1;
		else {
		while(a>=1) {
			fact =  fact * a;
			a--;
		}
		}
		return fact;
	}

}
