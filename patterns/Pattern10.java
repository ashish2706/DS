package patterns;
import java.util.*;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of rows");
		int n = s.nextInt();
		
		int outerspaces = n/2;
		int innerspaces = -1;
		int stars = 1;
		
		for(int i =1;i<=n;i++) {
			
			for(int j =1;j<=outerspaces;j++)
				System.out.print("\t");
			
			System.out.print("*\t");
			
			for(int k =1;k<=innerspaces;k++)
				System.out.print("\t");
			
			if(i!=1 && i!=n) {
			System.out.print("*\t");
			}
			
			for(int j =1;j<=outerspaces;j++)
				System.out.print("\t");
			
			if(i<=n/2) {
				outerspaces -= 1;
				innerspaces +=2;
			}
			else {
				outerspaces +=1;
				innerspaces -=2;
			}
			System.out.println();
		}
		
	}

}
