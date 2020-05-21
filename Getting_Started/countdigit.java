package Getting_Started;
import java.util.*;

public class countdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =  new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n = s.nextInt();
		System.out.println();
		
		int count = 0;
		
		while(n>=1) {
			count++;
			
			n = n/10;
		}
	System.out.println(count);	
	}

}
