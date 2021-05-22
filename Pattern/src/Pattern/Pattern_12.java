package Pattern;

import java.util.Scanner;

public class Pattern_12 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int a=0;
		int b=1;
		int c=0;
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=i) {
				System.out.print(a+" ");
				c=a+b;
				a=b;
				b=c;
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
