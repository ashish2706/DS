package Getting_Started;

import java.util.Scanner;

public class fibonnacinumber {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner s =  new Scanner(System.in);
		
		System.out.println("Print fibonacci till number!!!!!!!!");
		
		int n = s.nextInt();
		
		System.out.println();
		
		int a =0;
		int b =1; 

		
		for(int i =0;i<=n;i++) {
			
			System.out.println(a);
			
			int temp = a+b;
			a = b;
			b = temp;	
		}

	}

}
