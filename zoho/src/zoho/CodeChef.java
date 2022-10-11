package zoho;

import java.util.Arrays;
import java.util.Scanner;

public class CodeChef {

	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int i,j;
	    
	    while(n!=0) {
	    	int m = sc.nextInt();
	    	int a[] = new int[m];
	    	for(i=0;i<m;i++) {
	    		a[i]= sc.nextInt();
	    	}
	    	
	    	System.out.println(check(a));
	    	int max = check(a);
	    	while()
	    	n--;
	    }
	}

	public static int check(int a[]) {
		int i,j,b,count=0,max=0;
		int c = 0;
		int in[] = new int[a.length];
		for(i=0;i<a.length;i++) {
			for(j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			in[i] = count;
			if(max < count) {
				max = count;
				c = a[i];
			}
			count=0;
		}
		System.out.println(Arrays.toString(in));
		return c;
		
	}
}
