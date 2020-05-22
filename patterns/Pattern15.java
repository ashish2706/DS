package patterns;
import java.util.Scanner;

public class Pattern15 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n = s.nextInt();
		System.out.println();
		
		int outerspaces = n/2;
		int val =1,stars = 1;
		
		for(int i = 1;i<=n;i++) {
			
			for(int j =1;j<=outerspaces;j++)
				System.out.print("\t");
			
			int cval = val;
			
			for(int k =1;k<=stars;k++) {
				System.out.print(cval+"\t");
				
			if(k<=stars/2)
					cval++;
				else
					cval--;
			}
			if(i<=n/2) {
				outerspaces -=1;
				stars +=2;
				val ++;
			}
			else {
				outerspaces +=1;			
				stars -=2;	
				val--;
		}
				System.out.println();
		}
	}
}
