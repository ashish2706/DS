package patterns;
import java.util.*;
import java.io.*;

public class Pattern12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of rows");
		int n = s.nextInt();	
		int val1 = 0;
		int val2 = 1;
		
		for(int i =1;i<=n;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print(val1+"\t");
				int temp = val1 + val2;
				val1 = val2;
				val2 =  temp;
			}
			System.out.println();
		}
	}
}
