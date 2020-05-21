package Getting_Started;

import java.util.Scanner;

public class reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int n = s.nextInt();
		System.out.println();
		
		int rev = 0;
		while(n>=1){
			int rem = n % 10;	
//		 rev = rev*10 + rem;
			System.out.println(rem);
		 n = n/10;	
		}
		System.out.println(rev);
	}

}
