package Getting_Started;
import java.util.*;

public class isnumberprime {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		
		System.out.println("Enter the number of test cases");
		int t = s.nextInt();
		
		while(t>0) {
		System.out.println("Enter the number");
		int n = s.nextInt();
		
		System.out.println();
		int flag = 0;
		
		for(int i = 2;i*i<=n;i++){// If a given number do not have any factor till root(N), then after that we need not check for 
		{			///  its factor after that, so we can directly say that number is prime. 
					// we do not run loop till N or N/2...................
			if(n%i==0) {
				flag = 1;
				break;
			}	
		}
		if(flag==1)
			System.out.println("Not prime ");
		else
			System.out.println("Prime ");
		t--;
		}
	}
}
