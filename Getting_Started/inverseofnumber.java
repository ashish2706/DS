package Getting_Started;
import java.util.*;


public class inverseofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number within the constraints");
		
		int n = s.nextInt();
		
		int pos = 1,num = 0;
		while(n>=1) {
			
			int digit = n%10;
			num = num + pos*(int)Math.pow(10, digit-1);
			
			n = n/10;
			pos++;
		}
		System.out.println(num);
		
	}

}
