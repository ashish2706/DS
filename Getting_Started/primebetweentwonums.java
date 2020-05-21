package Getting_Started;

import java.util.*;

public class primebetweentwonums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		
		int low = s.nextInt();
		System.out.println();
		
		System.out.println("Enter the second number");
		int high = s.nextInt();
		
		System.out.println();
		
		while(low<=high) {
			boolean flag = true;

			for(int j =2;j*j<=low;j++)
			{
				if(low%j==0)
				{
					flag = false;
					break;
				}
			}
			if(flag==true)
				System.out.println(low);
			
			low++;
			
		}
		
		
	}

}
