package patterns;
import java.util.*;

public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in); 
		
		System.out.println("Enter the number");
		int n = s.nextInt();
		
		System.out.println();
		
		for(int i =1;i<=10;i++) {
			
			System.out.println(n+"*"+i+"="+n*i);
			System.out.println();
		}

	}

}
