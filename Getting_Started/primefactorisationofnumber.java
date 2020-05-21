package Getting_Started;
import java.util.*;


public class primefactorisationofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number");
		System.out.println();
		
		int n = s.nextInt();
		
		int i =2;
		while(n>=1) {
			
		if(n%i==0) {
			
			n = n/i;
			System.out.print(i+" \t");
		}
		else 	
		i++;
			
		}

	}

}
