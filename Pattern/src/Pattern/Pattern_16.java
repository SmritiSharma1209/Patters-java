package Pattern;

import java.util.Scanner;

public class Pattern_16 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		/*for(int i=1;i<=n;++i) {
			for(int j=1;j<=i;++j) {
				System.out.print(j);
				
			}
			System.out.println();
		}*/
		
		int stars=1;
		int spaces=n+1;
		int val=1;
		
		for(int i=1;i<=n;++i){
			if(spaces>0) {
			
			for(int j=1;j<=stars;++j) {
				System.out.print(val);
				val=val+1;
			}
			for(int j=1;j<=spaces;++j) {
				System.out.print(" ");
			}
			for(int j=1;j<=stars;++j) {
				val=val-1;
				System.out.print(val);
				
			}
		    
			stars++;
			spaces=spaces-2;
			
			System.out.println();
			
			}else {
				for(int j=1;j<=(2*n-1);++j) {
					if(j<=((2*n-1)/2)) {
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
