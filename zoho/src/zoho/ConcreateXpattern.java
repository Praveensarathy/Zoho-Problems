package zoho;

import java.util.Scanner;

public class ConcreateXpattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m=sc.nextInt();
		int i,j,k;
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				k= min(i,j);
				k = min(k,m-i-1);
				k= min(k,n-j-1);
				if(k==0)
					System.out.print("X");
				else
					System.out.print("0");
			}
			System.out.println();
		}
	}
	public static int min(int a,int b) {
		return (a<b)? a:b;
	}


}
