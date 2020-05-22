package patterns;
import java.util.Scanner;

public class Pattern20 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of rows");
		int n = s.nextInt();
		
		System.out.println();
		
		for(int i =1;i<=n;i++){
			for(int j =1;j<=n;j++){
				if(j==1 || j==n)
					System.out.print("*\t");
			
				else if(i>n/2 && (i+j==n+1 || i==j))
				System.out.print("*\t");
			else
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}
