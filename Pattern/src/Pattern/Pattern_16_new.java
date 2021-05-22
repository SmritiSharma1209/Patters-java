package Pattern;

import java.util.Scanner;

public class Pattern_16_new {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int stars=2;
		int spaces=(2*n-1)-stars;
		int val=1;
				for(int i=1;i<=n;++i) {
					if(spaces>0) {
					for(int j=1;j<=stars/2;++j) {
						System.out.print(val);
						val++;
					}
					for(int j=1;j<=spaces;++j) {
						System.out.print(" ");
					}
					for(int j=1;j<=stars/2;++j) {
						val--;
						System.out.print(val);
				
					}
					System.out.println();
					stars=stars+2;
					spaces=spaces-2;
					
					
				}
	
				else {
					for(int j=1;j<=(2*n-1);++j) {
						if(j<=(2*n-1)/2) {
							System.out.print(val);
							val++;
							}else {
								
								System.out.print(val);
								val--;
							}
						
					}
				}

	         }

}
}
