package Pattern;

import java.util.Scanner;

public class Pattern_8 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		/*int i=1;
		while(i<=n) {
			int space=n-i;
			while(space>=1) {
				System.out.print(" ");
				space--;
			}
			System.out.print("*");
			System.out.println();
			i++;
			
		}*/
		
		for(int i=0;i<=n;++i) {
			for(int j=1;j<=n;++j) {
				if(i+j==n+1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
