package patterns;
import java.util.*;

public class Pattern4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n = s.nextInt();
		
		System.out.println();
		
		for(int i =1;i<=n;i++){
			for(int j =1;j<i;j++)
				System.out.print("\t");
			
			for(int k = i;k<=n;k++)
				System.out.print("*\t");
			
			System.out.println();
		}
	}

}
