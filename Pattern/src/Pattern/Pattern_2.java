package Pattern;

import java.util.Scanner;

public class Pattern_2 {

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
			System.out.println();
			i--;
			
		}

	}

}
