package Getting_Started;
import java.io.InputStream;
import java.util.*;


public class gcdlcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner s = new Scanner(System.in);
			
			System.out.println("Enter the first number ");
			System.out.println();
			int n = s.nextInt();
			
			System.out.println("Enter the second number");
			System.out.println();
			int m = s.nextInt();
			
			int gcd = findgcd(n,m);
			
			int lcm = n*m/gcd;
			
			System.out.println("L.C.M = "+ lcm +"\t "+ "G.C.D = "+ gcd);	
	}
	

	public static int findgcd(int a, int b) {
		
		while(a!=b) {
			if(a>b)
			a = a-b;
		
			else 
			b = b-a;
		}
		return b;
		
	}

}
