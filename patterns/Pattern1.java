package patterns;
import java.util.*;

public class Pattern1{
	public static void main(String[] args) {
		System.out.println("Enter how many rows to print");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		System.out.println(); 
		for(int i=1;i<=n;i++){
			for(int j = 1;j<=i;j++)
			System.out.print("*\t");
			
			System.out.println();
		}
	}
}
