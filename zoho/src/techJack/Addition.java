package techJack;

import java.util.ArrayList;
import java.util.Collections;

public class Addition {

	public static void main(String[] args) {
		int a[] = {7,2,3,4,5,3,1,2,7,2,8};
		int b[] = {1,2,3};
		ArrayList<Integer> addition = new ArrayList();
		int carry =0; 
		int i= a.length-1;
		int j = b.length-1;
		while(i >= 0 || j >= 0 || carry != 0) {
			int x = (j>=0)? b[j] : 0  ;
			int y = (i>=0)? a[i] :0;
			int sum = carry + x + y;
			addition.add(sum%10);
			carry = sum/10;
			if(j >= 0) {
				j--;
			}
			if(i >= 0) {
				i--;
			}
			
		}
		for(i=addition.size()-1;i>=0;i--) {
			System.out.print(addition.get(i) + "  ");
		}
		System.out.println();
		Collections.reverse(addition);
		System.out.print(addition);
	}

}
