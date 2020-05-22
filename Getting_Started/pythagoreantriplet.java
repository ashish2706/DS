package Getting_Started;
import java.util.Scanner;

public class pythagoreantriplet {
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			
			System.out.println("Enter the value of three input variables");
			System.out.println("Is pythagorean triplet");
			
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			
			if(a*a == b*b + c*c)
				System.out.println("Yes");
			
			else if(b*b == a*a + c*c)
				System.out.println("Yes");
			
			else if(c*c == a*a + b*b)
				System.out.println("Yes");
			
			else
				System.out.println("No");
	}

}
