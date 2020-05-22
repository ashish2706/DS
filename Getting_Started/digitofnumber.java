package Getting_Started;
import java.util.*;

public class digitofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		
		int n1 = n,count=0;
		while(n1>=1) {
			count++;
			n1 = n1/10;
		}
		while(count>=1) {
			
			int power = (int)Math.pow(10,count-1);
			int rem  = n /power;
			System.out.println(rem);
			
			n = n%power;
			count--;
		}
	}

}
