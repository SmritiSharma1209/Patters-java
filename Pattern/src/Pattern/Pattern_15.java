package Pattern;

import java.util.Scanner;

public class Pattern_15 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int spaces=n/2;
		int stars=1;
		int val=1;
		
		for(int i=1;i<=n;++i) {
			for(int j=1;j<=spaces;++j) {
				System.out.print(" ");
			}
			int cval=val;
			for(int j=1;j<=stars;++j) {
				System.out.print(cval);
				if(j<=stars/2) {
					cval++;
				}else {
					cval--;
				}
			}
			
			if(i<=n/2) {
				spaces--;
				stars=stars+2;
				val++;
			}else {
				spaces++;
				stars=stars-2;
				val--;
			}
			
			System.out.println();
		}

	}

}
