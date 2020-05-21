package Getting_Started;
import java.util.*;


public class isnumberprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in); 
		
		System.out.println("Enter the number of test cases");
		int t = s.nextInt();
		
		while(t>0) { 
		
		System.out.println("Enter the number");
		int n = s.nextInt();
		
		System.out.println();
		int flag = 0;
		
		for(int i = 2;i*i<=n;i++)// kissi bi number ke ek na ek factor root(n) tk aa hi jata hai .agr kisi ka factor root(n) tk nhi
		{						/// aaya to uske factor aage bi nhi aayenge. so we can directly say ki number is not prime. 
								// hume number tk loop chalane ki jarurt nhi hai ..
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
