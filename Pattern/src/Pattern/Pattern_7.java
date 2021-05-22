package Pattern;

import java.util.Scanner;

public class Pattern_7 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		/*int i=1;
		while(i<=n) {
			int j=1;
			while(j<i) {
				System.out.print(" ");
				j++;
			}
			System.out.print("*");
			System.out.println();
			i++;
		}*/
		
		for(int i=1;i<=n;++i) {
			for(int j=1;j<=n;++j ) {
				if(i==j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
