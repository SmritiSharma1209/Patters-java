package Pattern;

import java.util.Scanner;

public class Pattern_5 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int nspaces=n/2;
		int nstars=1;
		for(int i=1;i<=n;++i) {
			for(int j=1;j<=nspaces;++j) {
				System.out.print(" ");
			}
			for(int j=1;j<=nstars;++j) {
				System.out.print("*");
			}
			if(i<=n/2) {
				nspaces--;
				nstars=nstars+2;
			}else {
				nspaces++;
				nstars=nstars-2;
			}
			System.out.println();
		}
}
}
