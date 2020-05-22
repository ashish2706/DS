package patterns;
import java.util.*;

public class Pattern3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the row value");
		int n = scn.nextInt();
		
		System.out.println();
		
		for(int i =1;i<=n;i++){
			for(int j =1;j<=n-i;j++)
				System.out.print("\t");
			
			for(int k = n-i+1;k<=n;k++)
				System.out.print("*\t");
			
			System.out.println();
		}
	}
}
