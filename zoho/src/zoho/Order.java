package zoho;

import java.util.Arrays;
import java.util.Collections;

public class Order {

	public static void main(String[] args) {
		int a[] = {13,24,15,12,10,5};
		int i,j=0,k=0;
		int odd[] = new int[a.length];
		int e[] = new int[a.length];
		for(i=0;i<a.length;i++) {
			if(i%2 == 0) {
				odd[j++] = a[i]; 
			}
			else
				e[k++] = a[i];
		}
		int temp =0;
		for(i=0;i<odd.length;i++) {
			for(j=i+1;j<odd.length;j++) {
				if(odd[i] < odd[j]) {
					temp = odd[i];
					odd[i] = odd[j];
					odd[j] = temp;
				}
				if(e[i] > e[j])
				temp = e[i];
				e[i] = e[j];
				e[j] = temp;
			}
		}
		i=0;j=0;
		while(i<odd.length || j< e.length) {
			System.out.print(odd[i]);
			System.out.print(e[j]);
			j++;
			i++;
		}
	}
}