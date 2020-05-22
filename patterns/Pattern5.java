package patterns;
import java.util.*;

public class Pattern5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n = s.nextInt();
		
		int outerspaces= n/2;
		int stars =1;
		
		for(int i =1;i<=n;i++){
			for(int j=1;j<=outerspaces;j++)
				System.out.print("\t");
			
			for(int k =1;k<=stars;k++)
				System.out.print("*\t");
			
			if(i<=n/2){
				outerspaces -= 1;
				stars += 2;
			}
			else {
				outerspaces += 1;
				stars -= 2;
			}
			System.out.println();
		}	
	}
}
