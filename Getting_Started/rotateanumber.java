package Getting_Started;
import java.util.*;


public class rotateanumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =  new Scanner(System.in);
		System.out.println();
		System.out.println("Enter the number");
		int n = s.nextInt();
		
		System.out.println("Enter the K value");
		int k = s.nextInt();
		
		int n1 = n,count=0;
		
		while(n1>=1) {
			count++;
			n1 = n1/10;
		}
		System.out.println(count);
		
		if(k<0) {
			k = k+count;
		}
		
		int rev = 0;
		while(k>0) {
			
			int rem = n%10;
			int num = n/10;
			rev = num+ rem*(int)Math.pow(10, count-1);
			k--;
			n = rev;
		}
		System.out.println(rev);
	}

}
