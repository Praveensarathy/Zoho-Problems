package zoho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DigitToWord {

	public static void main(String[] args) {
		String[] one = new String[] {" ", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine","Ten"};
		String[] two = new String[] { "Twenty", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};  
		String[] three = new String[] {"",  "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<=10) {
			System.out.println(one[n]);
		}
		else if( n > 10 && n<=20) {
			System.out.println(two[n%10]);
		}
		else {
			int count = 0;
			int temp = n;
			while(temp!=0) {
				count++;
				temp /=10;
			}
			
			if(count ==2) {
				System.out.print(three[n/10] +" ");
				System.out.print(one[n%10]);
			}
			else if(count ==3) {
				System.out.print(one[n/100] + " hundred" );
				n = n-(n /100) *100;
				if(n!=0) {
				System.out.print(" and " +three[n/10] +" ");
				System.out.print(one[n%10]);
				}
			}
			else if(count == 4) {
				System.out.print(one[n/1000] + " Thousand " );
				n = n - (n/1000) * 1000;
				if(n!=0) {
					System.out.print(one[n/100] + " hundred" );
					n = n-(n /100) *100;
					if(n!=0) {
					System.out.print(" and " +three[n/10] +" ");
					System.out.print(one[n%10]);
				}
			}
		}
	 }
		
	}

}
