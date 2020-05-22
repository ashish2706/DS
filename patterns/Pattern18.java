package patterns;
import java.util.*;

public class Pattern18 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n = s.nextInt();
		
		int outerspaces = 0;
		int innerspaces = n-2;
		
		for(int i =1;i<=n;i++){
			for(int j =1;j<=outerspaces;j++)
			System.out.print("\t");
			
			System.out.print("*\t");
			
			if(i==1 || i>n/2+1) {
			for(int k = 1;k<=innerspaces;k++)
				System.out.print("*\t");
			}
			
			else{
				for(int k = 1;k<=innerspaces;k++)
					System.out.print("\t");
			}
			if(i!=n/2+1)
			System.out.print("*\t");
			
			if(i<=n/2){
				outerspaces +=1;
				innerspaces -=2;	
			}
			else {
				outerspaces -=1;
				innerspaces +=2;
			}
			System.out.println();
		}
	}
}
