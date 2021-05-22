package Pattern;

import java.util.Scanner;

public class Pattern_3 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int spaces=n-i;
			while(spaces>=1) {
				System.out.print(" ");
				spaces--;
				
			}
			int j=1;
		     while(j<=i) {
				System.out.print("*");
				j++;
			}
		     System.out.println();
		     i++;
		}

	}

}
