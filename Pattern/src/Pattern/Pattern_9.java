package Pattern;

import java.util.Scanner;

public class Pattern_9 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		/*int spaces=0;
		for(int i=1;i<=n;++i) {
			
			for(int j=1;j<=spaces;++j) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
			
			if(i<(n+1)/2) {
				spaces++;
			}else {
				spaces--;
			}
			
		}*/
		for(int i=1;i<=n;++i) {
			for(int j=1;j<=n;++j) {
				if(i==j|| i+j==n+1) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
			}
			System.out.println();
		}
		
		
	}

}
