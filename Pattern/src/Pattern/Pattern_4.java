package Pattern;

import java.util.Scanner;

public class Pattern_4 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int i=n;
		while(i>=1) {
			int j=i;
			while(j>=1) {
				System.out.print("*");
				j--;
			}
			int spaces=n-i;
			while(spaces>=1) {
				System.out.print("");
				spaces--;
			}
			
			System.out.println();
			i--;
		}

	}

}
