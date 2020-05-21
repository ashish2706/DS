package Getting_Started;

import java.util.Scanner;

public class benjaminBulbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner s =  new Scanner(System.in);
			
			System.out.println("Enter the number of bulbs");
			int n = s.nextInt();
			
			int fluctuation = n;
			
			for(int i =1;i*i<=n;i++)
			{
				System.out.println(i*i);
			}
			
	}

}
