package Pattern;

import java.util.Scanner;

public class Pattern_6 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int stars=(n/2)+1;
		int space=1;
		for(int i=1;i<=n;++i) {
			/*System.out.println(stars+","+space+","+stars);*/
			for(int j=1;j<=stars;++j) {
				System.out.print("*");
				
			}
            for(int j=1;j<=space;++j) {
            	System.out.print(" ");
				
			}
            for(int j=1;j<=stars;++j) {
            	System.out.print("*");
	
            }
            System.out.println(" ");
			
			
			if(i<=n/2) {
				stars--;
				space=space+2;
			}else {
				stars++;
				space=space-2;
			}
		}

	}

}
