package techJack;

import java.util.Scanner;

public class OddNumInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		int i=s;
		while(i < e) {
			if(i%2!=0) {
				System.out.print(i +" ");
			}
			i++;
		}
	}

}
