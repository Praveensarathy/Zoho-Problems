package zoho;

import java.util.ArrayList;
import java.util.Arrays;

public class UnionInteration {

	public static void main(String[] args) {
		int n , m ,i,j;
		int a[] = {1,3,4,5,6,8,9};
		
		int b[]  = {1,5,8,9,2};
		n = a.length;
		m = b.length;
		int c[] = new int[n+m];
		int in[] = new int[n+m]; 
		ArrayList<Integer> uni = new ArrayList();
		i=0;
		while(i < n) {
			//uni.add(a[i]);
			c[i] = a[i++];
		}
		j=0;
		while(j < m) {
			//uni.add(b[j]);
			c[i++] = b[j++];
		}
		
		
		int k ;
		int len =c.length;
		for(i=0;i<len;i++) {
			for(j=i+1;j<len;j++) {
				if(c[i]==c[j]) {
					for(k = j;k< len-1;k++) {
						c[k] = c[k+1]; 
					}
					j--;
					len--;
				}
			}
			System.out.print(c[i] + " ");
		}
		k=0;
		System.out.println();
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				if(a[i] == b[j]) {
					in[k++] = a[i];
				}
			}
		}
		for(i=0;i<k;i++) {
			System.out.print(in[i] +"  ");
		}
		for(i=0;i<n;i++) {
			if(a[i]%2 ==0) {
				for(k = i;k< n-1;k++) {
					a[k] = a[k+1]; 
				}
				i--;
				n--;
			}
		}
		System.out.println();
		for(k=0;k<i;k++) {
			System.out.print(a[k]+ "  ");
		}
		for(i=0;i<m;i++) {
			if(b[i]%2 !=0) {
				for(k = i;k< m-1;k++) {
					b[k] = b[k+1]; 
				}
				i--;
				m--;
			}
		}
		for(k=0;k<i;k++) {
			System.out.print(b[k]+ "  ");
		}	
	}
}
